package com.succez.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

public class FileDownload {

	private static final int cache = 1024;

	/**
	 * 利用工具包httpclient-4.5.2.jar和httpcore-4.4.4.jar实现文件下载
	 * 
	 * @param url
	 * @param filePath
	 * @throws MyException 
	 */
	public static void download(String url, String filePath) throws IOException {

		InputStream in = null;
		FileOutputStream out = null;
		try {
			HttpClient client = HttpClients.createDefault();
			HttpGet httpGet = new HttpGet(url);
			HttpResponse response = client.execute(httpGet);
			HttpEntity entity = response.getEntity();
			in = entity.getContent();
			File file = new File(filePath);
			out = new FileOutputStream(file);
			writeFile( in,out, cache);
		
		} catch (Exception e) {
			throw new IOException("文件下载出错！");
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	private static void writeFile(InputStream in,OutputStream out, int cache) throws IOException {
		byte[] buf = new byte[cache];
		int c = 0;
		try {
			while ((c = in.read(buf)) != -1) {
				out.write(buf, 0, c);
			}
			out.flush();
		} catch (IOException e) {
			throw new IOException("文件下载出错！");
		}
	}

}
