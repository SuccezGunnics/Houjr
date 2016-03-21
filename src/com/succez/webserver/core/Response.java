package com.succez.webserver.core;
/**
 * 响应类接口
 * @author Gunnics
 *
 */

public interface Response {
	
	/**
	 *  写入相应信息
	 * @param result 响应结果
	 */
	public void  write(String result);

}
