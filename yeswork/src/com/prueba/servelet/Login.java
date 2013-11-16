package com.prueba.servelet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;






import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.prueba.modelo.Usuario;



public class Login extends HttpServlet {
	
	

	/*public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		UserService userService = UserServiceFactory.getUserService();

		String thisURL = request.getRequestURI();
		if (request.getUserPrincipal() != null) {
			response.getWriter().println(
					"<p>Hello, " + request.getUserPrincipal().getName()
							+ "!  You can <a href=\""
							+ userService.createLogoutURL(thisURL)
							+ "\">sign out</a>.</p>");
		} else {
			response.getWriter().println(
					"<p>Please <a href=\""
							+ userService.createLoginURL(thisURL)
							+ "\">sign in</a>.</p>");
		}
	}*/
	
	  public void doGet(HttpServletRequest req, HttpServletResponse resp)
	 throws IOException {
		  
		 
	  
	  UserService userService = UserServiceFactory.getUserService(); 
	  User user = userService.getCurrentUser();
	  
	  if (user != null) { resp.setContentType("text/plain");
	  resp.getWriter().println("Bienvenidoo, " + user.getNickname()); } else {
	  resp.sendRedirect(userService.createLoginURL(req.getRequestURI())); } 
	 
	 
		
	   try {
	      Usuario.createUsuario("usuario1", "Carlos", "Ramirez", "carlos@gmail.com", 1, true);
	    } catch (Exception e) {
	      String msg = Util.getErrorResponse(e);
	      
	      
	    }
	   resp.sendRedirect("empresa2.jsp");
	  }
	  
	  
	  
		  
	//  }
	  
	 
	  
	  
	  
	  
	 
	  } 
	 

	  	  




