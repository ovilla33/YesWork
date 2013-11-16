package com.prueba.modelo;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.KeyFactory;

import com.google.appengine.api.datastore.Key;
import com.prueba.servelet.Util;


public class Usuario {
	
	private String nombre, apellido, email;
	private int proyecto;
	private boolean estado;
	
	public Usuario()
	{
		
	}
	
	public Usuario (String nombre, String apellido, String email, int proyecto, boolean estado)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.proyecto = proyecto;
		this.estado = estado;
	}
	
	public static void createUsuario(String nombreEnt, String nombre, String apellido,
			String email, int proyecto, boolean estado) {
		Entity User = null;
		Entity product = getProduct(nombreEnt);
	    if (product == null) {
	    	User.setProperty("tipo", "user");
	    	User = new Entity("Usuario", nombreEnt);
			User.setProperty("nombre", nombre);
			User.setProperty("apellido", apellido);
			User.setProperty("email", email);
			User.setProperty("proyecto", proyecto);
			User.setProperty("estado", estado);
	    } else {
	    	User.setProperty("tipo", "user");
			User.setProperty("nombre", nombre);
			User.setProperty("apellido", apellido);
			User.setProperty("email", email);
			User.setProperty("proyecto", proyecto);
			User.setProperty("estado", estado);
	    }
		
		
	  }
	
	
	  public static Iterable<Entity> getAllUsuarios(String kind) {
		    return Util.listEntities(kind, null, null);
		  }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getProyecto() {
		return proyecto;
	}

	public void setProyecto(int proyecto) {
		this.proyecto = proyecto;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
	public static Entity getProduct(String name) {
	    Key key = KeyFactory.createKey("Product", name);
	    return Util.findEntity(key);
	  }
}
