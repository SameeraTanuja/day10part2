package com.capgemini.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Employee> al=new ArrayList<>();
	private ServletContext context;
   
   
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	context=config.getServletContext();
    	al.add(new Employee(567,"Sameera",15000,"java cloud"));
    	al.add(new Employee(779,"Santosh",40000,"mech"));
    	al.add(new Employee(338,"Suman",30000,"sap"));
    	al.add(new Employee(990,"Aishwarya",20000,"informatica"));
    	al.add(new Employee(440,"Mahesh",10000,"java"));
    	
    }

    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	 String employeeId=request.getParameter("employeeId");
		for(Employee employee : al) {
			if(employee.getEmployeeId()==Long.parseLong(employeeId))
			{
				out.println("<table border='1' align='center'>");
				out.println("<tr><th>"+employee.getEmployeeId()+"</th><th>"+employee.getEmployeeName()+"</th><th>"+employee.getEmployeeSalary()+"</th><th>"+employee.getNameOfDepartment());
				out.println("</tr></table");
			
				
			}
				
		}
		
	}
	}


