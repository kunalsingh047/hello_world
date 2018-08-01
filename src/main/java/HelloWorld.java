package com.demo;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet{ 
  public void doGet(HttpServletRequest request, 
  HttpServletResponse response)
  throws ServletException,IOException{
  response.setContentType("text/html");
  PrintWriter pw = response.getWriter();
  pw.println("<html>");
  pw.println("<head><title>NO</title></title>");
  pw.println("<body>");
  pw.println("<h1>NO</h1>");
  pw.println("</body></html>");
  }
}