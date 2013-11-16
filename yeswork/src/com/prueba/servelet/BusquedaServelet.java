package com.prueba.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mortbay.util.ajax.JSON;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

import com.prueba.modelo.Usuario;

public class BusquedaServelet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
				
	   // super.doGet(req, resp);
	    
	   
	    //PrintWriter out = resp.getWriter();
	    Iterable<Entity> entities = null;
	  
	    entities = Util.listEntities("Usuario", "tipo", "user");
	   
	     // entities = Usuario.getAllUsuarios("Usuario");
		  String hola = Util.writeJSON(entities);
	    
	      /*entities = Usuario.getAllUsuarios("Usuario");
	      
	      Iterable<Entity> lista =(Iterable<Entity>) entities;
	      Iterator<Entity> inter = lista.iterator();

	      ArrayList listaUs = new ArrayList();
	      
	      
	      while (inter.hasNext())
	      {
	    	  Entity entidad = inter.next();
		      String nom = entidad.getProperty("nombre").toString();
		      String ape = entidad.getProperty("apellido").toString();
		      String emai = entidad.getProperty("email").toString();
		      //int proy = (Integer) entidad.getProperty("proyecto");
		      boolean sab = (Boolean) entidad.getProperty("estado");
				
	    	  Usuario user = new Usuario(nom, ape, emai, 1, sab);
	    	  listaUs.add(user);
	      
	      	
		 
	      }*/
	      req.getSession().setAttribute("hola", hola);
		  resp.sendRedirect("empresa2.jsp");
		
		}
		
		
	
	
	

}
