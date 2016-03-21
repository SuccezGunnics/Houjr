package com.succez.webserver.core;

/**
 * 消息处理借口类
 * @author Gunnics
 *
 */
public interface Handler {
	
	/**
	 * 判断请求类型，处理消息
	 * @param request
	 * @param response
	 */	
	public void service(Request request,Response response);
	
	/**
	 * 处理get请求
	 * @param request
	 * @param response
	 */
	public void doGet(Request request,Response response);
	
	/**
	 * 处理post请求
	 * @param request
	 * @param response
	 */
	public void doPost(Request request,Response response);
}
