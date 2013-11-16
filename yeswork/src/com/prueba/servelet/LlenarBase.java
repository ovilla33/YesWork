package com.prueba.servelet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class LlenarBase extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		  
		  Entity employee = new Entity("Employee");
		  employee.setProperty("firstName", "Antonio");
		  employee.setProperty("lastName", "Salieri");
		  Date hireDate = new Date();
		  employee.setProperty("hireDate", hireDate);
		  employee.setProperty("attendedHrTraining", true);
		  
		  datastore.put(employee);
	}

	
}
