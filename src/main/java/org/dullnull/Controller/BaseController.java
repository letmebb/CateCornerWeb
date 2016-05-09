package org.dullnull.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

public class BaseController {
	protected SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public void printJSON(HttpServletResponse response, Object obj) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Content-type", "application/json");
		try {
			PrintWriter out = response.getWriter();
			out.print(JSON.toJSONString(obj));
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void out(HttpServletResponse response, String content) {
		try {
			response.setHeader("Content-type", "application/json");
			PrintWriter out = response.getWriter();
			out.print(content);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
