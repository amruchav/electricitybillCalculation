package com.cg.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cg.bean.CustomerBean;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.ICustomerService;


@WebServlet("*.obj")
public class HomeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerBean bean=new CustomerBean();
		ICustomerService service=new CustomerServiceImpl();
		String path=request.getServletPath();
		System.out.println(path);
		String target=null;
		switch(path)
		{
		case "/customer.obj":
		String consumerno=request.getParameter("num");
		int consumerNo=Integer.parseInt(consumerno);
		String consumername=request.getParameter("name");
		System.out.println(consumername);
		String email=request.getParameter("email");
		String mobno=request.getParameter("mob");
		bean.setConsumerNo(consumerNo);
		bean.setCustomerName(consumername);
		bean.setEmailId(email);
		bean.setPhoneNo(mobno);
		int res=service.addDetails(bean);
		if(res>0)
		{
			target="success.html";
		}
		else
		{
			target="Error.html";
		}
		break;
		}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
		}
		
		
	}


