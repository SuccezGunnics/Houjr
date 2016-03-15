package day1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

public class SecondPractive {

	private static final int cache = 1024;

	/**
	 * 利用工具包httpclient-4.5.2.jar和httpcore-4.4.4.jar实现文件下载
	 * @param url
	 * @param filePath
	 */
	public static  void download(String url, String filePath) {
	
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

			byte[] buf = new byte[cache];
			int c = 0;
			while ((c = in.read(buf)) != -1) {
				out.write(buf, 0, c);
			}
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public static void main(String[] args) {
	
		
	}
}
