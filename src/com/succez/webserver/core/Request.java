package com.succez.webserver.core;

public interface Request {

	// 基本请求方式
	public static final String GET ="GET";
	public static final String POST ="POST";
	
	/**
	 * 获取请求参数
	 * @param param 请求参数
	 * @return 返回参数值
	 */
	public String getParamter(String param);
	
	/**
	 * 获取方法名
	 * @return
	 */
	public String getMethod();
	
	/**
	 * 初始化请求头
	 */
	public void initRequestHeader();
	
	/**
	 * 初始化请求参数
	 */
	public void initRequestParam();
	
	/**
	 * 初始化请求内容
	 */
	public void initRequestBody();
	
	
	/**
	 * 获取RequestBody
	 */
	public void getRequestBody();
}
