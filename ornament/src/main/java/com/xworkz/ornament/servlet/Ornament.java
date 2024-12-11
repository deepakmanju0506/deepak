package com.xworkz.ornament.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (urlPatterns = "/gold",loadOnStartup = 1)
public class Ornament extends HttpServlet {

    public Ornament(){
        System.out.println("Ornaments is running in servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter=resp.getWriter();
        String name=req.getParameter("name");

        PrintWriter printWriter1=resp.getWriter();
        String grams=req.getParameter("grams");
    }
}
