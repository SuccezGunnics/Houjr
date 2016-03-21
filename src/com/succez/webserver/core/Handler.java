package com.succez.webserver.core;

/**
 * ��Ϣ��������
 * @author Gunnics
 *
 */
public interface Handler {
	
	/**
	 * �ж��������ͣ�������Ϣ
	 * @param request
	 * @param response
	 */	
	public void service(Request request,Response response);
	
	/**
	 * ����get����
	 * @param request
	 * @param response
	 */
	public void doGet(Request request,Response response);
	
	/**
	 * ����post����
	 * @param request
	 * @param response
	 */
	public void doPost(Request request,Response response);
}
