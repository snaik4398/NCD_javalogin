package com.exp1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calc extends HttpServlet{
  public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	  
	  int i=Integer.parseInt(req.getParameter("age"));
	  
	  int j1=Integer.parseInt(req.getParameter("2pp"));
	  int j2=Integer.parseInt(req.getParameter("3pp"));
	  int j3=Integer.parseInt(req.getParameter("4pp"));
	  int j4=Integer.parseInt(req.getParameter("5pp"));
	  int j5=Integer.parseInt(req.getParameter("6pp"));
	  
	  int k=i+j1+j2+j3+j4+j5;
	  PrintWriter out=res.getWriter();
	  out.println("result is :"+k);
	  if(k >= 4)
	  {
		  out.println("NEED TO SCRINNING");
	  }
	  else{
		  out.println(" NO NEED TO SCRINNING");
	  }

  }
  

}
