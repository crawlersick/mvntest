package com.sick.twimg.ccthread;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class test123 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setHeader("Content-Type", "text/plain; charset=utf-8");
		res.setCharacterEncoding("UTF-8");
		
		ArrayList res1=new ArrayList();
		res1.add("ab");
		res1.add("ccdd");
		
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		String json = gson.toJson(res1);  
		res.getWriter().append(json);
	}
}
