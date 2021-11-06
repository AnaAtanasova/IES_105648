package com.howtodoinjava.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyFirstServlet", urlPatterns = {"/MyFirstServlet"})
public class MyFirstServlet extends HttpServlet {
    private String message;
    public void init(){
        message="Hello, Ana.Welcome";
    }

    private static final long serialVersionUID = -1915463532411657451L;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>"+message);
        out.println("</h1></body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        //Do some other work
    }
}
