package com.xworkz.ecommer.servlet;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ecommer.DTO.SignUpDTO;
import com.xworkz.ecommer.service.SignUpService;
import com.xworkz.ecommer.service.SignUpServiceImpl;


@WebServlet(loadOnStartup = 1, urlPatterns = "/login")
public class SignUpServlet extends HttpServlet {
	
	public SignUpServlet() {
		System.out.println("Execute No-Args constructor of SignUpServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String userId=req.getParameter("userId");
		 String email= req.getParameter("email");
		 String password=req.getParameter("password");
		 String confirmPasword=req.getParameter("confirmPassword");
		 //int userId1=Integer.valueOf(userId);
		 
		 SignUpDTO login= new SignUpDTO(userId, email, password, confirmPasword);
		 System.out.println("Sign Up :"+ login);
		 
		 SignUpService service= new SignUpServiceImpl();
		 boolean check=service.validateAndSave(login);
		 
		 if(check) {
			 System.out.println("Data is valid");
			 RequestDispatcher request=req.getRequestDispatcher("/success.jsp");
			 req.setAttribute("success", "Sign Up succesfully");
			 request.forward(req, resp);
		 }else {
			 System.err.println("Data is In-Valid");
			 RequestDispatcher request=req.getRequestDispatcher("/signup.jsp");
			 req.setAttribute("failed", "SignUp Failed");
			 req.setAttribute("dto", new SignUpDTO(userId, email, password, confirmPasword));
			 request.forward(req, resp);
		 }
		 
		 

		
	}
	}