package com.capgemini.employeeapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.employeeapp.model.Employee;
import com.capgemini.employeeapp.model.EmployeeDao;



/**
 * Servlet implementation class DeleteEmployeeController
 */
@WebServlet("/delete")
public class DeleteEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	private EmployeeDao employeeDao;
    
       
    
    public DeleteEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }
@Override
public void init(ServletConfig config)throws ServletException{
	context=config.getServletContext();
}
	
		  @Override
		    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    	// TODO Auto-generated method stub
			  String id = request.getParameter("id");
			  employeeDao = (EmployeeDao) context.getAttribute("employeeDao");
				if(employeeDao.deleteEmployee(Integer.parseInt(id))) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("getAllEmployees");
					dispatcher.forward(request, response);
					
					
				}
				else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
				dispatcher.forward(request, response);
				
				
			}
		  }
}

		
		    			
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	


