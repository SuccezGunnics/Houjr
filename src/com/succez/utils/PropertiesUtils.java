package com.succez.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取src根目录下的配置文件，获取相关配置信息。
 * @author Gunnics
 *
 */

public class PropertiesUtils {

	private Properties config;
	private static PropertiesUtils instance = new PropertiesUtils();

	/**
	 * 单例模式得到PropertiesUtils对象。
	 * @return
	 */
	public static PropertiesUtils getInstance() {
		return instance;
	}

	/**
	 * 私有化构造器，在实例化对象时，加载配置文件。
	 */
	private PropertiesUtils() {
		InputStream in = getClass().getResourceAsStream("/config.properties");
		config = new Properties();
		try {
			if (config != null) {
				config.load(in);
			}
		} catch (IOException e) {
			throw new ConfigException("配置文件初始化失败！");
		}
	}

	/**
	 * 根据传入配置参数名称，返回该配置属性值；如果参数名不存在，返回null
	 * @param key 配置属性名
	 * @return 配置属性值
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
