package com.succez.webserver.core;

public interface Request {

	// ��������ʽ
	public static final String GET ="GET";
	public static final String POST ="POST";
	
	/**
	 * ��ȡ�������
	 * @param param �������
	 * @return ���ز���ֵ
	 */
	public String getParamter(String param);
	
	/**
	 * ��ȡ������
	 * @return
	 */
	public String getMethod();
	
	/**
	 * ��ʼ������ͷ
	 */
	public void initRequestHeader();
	
	/**
	 * ��ʼ���������
	 */
	public void initRequestParam();
	
	/**
	 * ��ʼ����������
	 */
	public void initRequestBody();
	
	
	/**
	 * ��ȡRequestBody
	 */
	public void getRequestBody();
}
