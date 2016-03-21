package com.succez.webserver.core.impl;

import com.succez.webserver.core.Handler;
import com.succez.webserver.core.Request;
import com.succez.webserver.core.Response;

public abstract class HttpHandler implements Handler {

	@Override
	public void service(Request request, Response response) {
		request.initRequestHeader();
		request.initRequestHeader();
		if(request.getMethod().equals(Request.GET)){
			doGet(request,response);
		}else if(request.getMethod().equals(Request.POST)){
			request.initRequestBody();
			doPost(request,response);
		}
	
	}

	@Override
	public abstract void doGet(Request request, Response response);

	@Override
	public abstract void doPost(Request request, Response response);

}
