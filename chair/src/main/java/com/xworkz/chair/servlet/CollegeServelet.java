package com.xworkz.chair.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.chair.DTO.CollegeDTO;

public class CollegeServelet extends HttpServlet {
	
	public CollegeServelet() {
		System.out.println("No-Args college Servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("studentName");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String address=req.getParameter("address");
		String father=req.getParameter("fatherName");
		String mother=req.getParameter("motherName");
		String percentage=req.getParameter("percentage");
		String course=req.getParameter("course");
		String age=req.getParameter("age");
		int convertedAge=Integer.valueOf(age);
		
		resp.setContentType("text/html");
		
		
		CollegeDTO college = new CollegeDTO(name, email, mobile, address, father, mother, percentage, course, convertedAge);
		System.out.println("College DTO :"+college);
		
		resp.getWriter().println(college);
	}
}	
	
