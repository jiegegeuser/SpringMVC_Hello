package com.atguigu.springmvc.views;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

@Component
public class MyView implements View{

	@Override
	public String getContentType() {
		
		return "text/html; charset=UTF-8";
	}

	@Override
	public void render(Map<String, ?> arg0, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write("Hey! It's my view!");
		response.getWriter().flush();
		response.getWriter().close();
	}
	
}
