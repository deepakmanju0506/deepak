package com.xworkz.furit.server;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
@WebServlet(urlPatterns = "/banana", loadOnStartup = 1)
public class Banana extends HttpServlet {



        public Banana() {
            System.out.println("Running no-args constructor");
        }

        @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            System.out.println("Running service method in ........");
            String url=  req.getRequestURL().toString();
            System.out.println("URL"+url);
            Enumeration<String> enumeration =req.getHeaderNames();
            while(enumeration.hasMoreElements())
            {
                String headerName=enumeration.nextElement();
                String value=req.getHeader(headerName);
                System.out.println(headerName+":"+value);
            }

            PrintWriter respWriter = resp.getWriter();

            respWriter.println("Servlet response is working......");



            String farmername = req.getParameter("Fname");
            String pricestr = req.getParameter("Nname");
            String quantitystr = req.getParameter("Qname");
            double price = Double.parseDouble(pricestr);
            int quantity = Integer.parseInt(quantitystr);

            double totalcost = price * quantity;
            PrintWriter printWriter = resp.getWriter();
            printWriter.println(" Banana details sent succesfully..");
            printWriter.println("The total cost of banana:" + totalcost);

            System.out.println("Farmer Name:" + farmername);
            System.out.println("Price:" + price);
            System.out.println("Quantity:" + quantity);



        }
    }

