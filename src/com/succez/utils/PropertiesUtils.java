package com.succez.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ��ȡsrc��Ŀ¼�µ������ļ�����ȡ���������Ϣ��
 * @author Gunnics
 *
 */

public class PropertiesUtils {

	private Properties config;
	private static PropertiesUtils instance = new PropertiesUtils();

	/**
	 * ����ģʽ�õ�PropertiesUtils����
	 * @return
	 */
	public static PropertiesUtils getInstance() {
		return instance;
	}

	/**
	 * ˽�л�����������ʵ��������ʱ�����������ļ���
	 */
	private PropertiesUtils() {
		InputStream in = getClass().getResourceAsStream("/config.properties");
		config = new Properties();
		try {
			if (config != null) {
				config.load(in);
			}
		} catch (IOException e) {
			throw new ConfigException("�����ļ���ʼ��ʧ�ܣ�");
		}
	}

	/**
	 * ���ݴ������ò������ƣ����ظ���������ֵ����������������ڣ�����null
	 * @param key ����������
	 * @return ��������ֵ
	 */
	public String getConfigValue(String key) {
		return config.getProperty(key);
	}

}

class ConfigException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConfigException(String message) {
		super(message);
	}

	public ConfigException() {
		super();
	}

}
