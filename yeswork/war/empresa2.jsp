<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.google.appengine.api.datastore.Entity" %>       
<%@ page import="java.util.*" %>  
<%@ page import="com.prueba.modelo.Usuario" %>




<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>yeswork.com</title>
<link href="css/general.css" rel="stylesheet" type="text/css">
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="dist/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
<script src="dist/js/bootstrap.js">
$('#home li:eq(1) a').tab('show') ;

</script>
<style>
body {
	background-color: #CCC;
	background-image: url(images/fondo2.png);
	background-repeat: repeat-x;
}</style>
</head>
<body>



<div id="cajacentrada">
<div   id="cabecera" >
<div   id="logocom"><img src="images/logoem.png" width="100%" ></div>
<div    id="logoempresa"><img src="imagen/logoempresa.jpg" width="145" height="145"></div>
</div>

<div >
<section  id="INFORME2"   ></section>
<!-- Nav tabs -->
<ul class="nav nav-tabs" id="myTab">
  <li class="active"><a href="#home" data-toggle="tab">Proyectos</a></li>
  <li><a href="#profile" data-toggle="tab">Empleados</a></li>
 
</ul>
<p> <%  

%> </p>



<% %>

<div class="tab-content"  style="background-color:#FFF; min-height:50px;">
  <div class="tab-pane active" id="home"  >
  <div  class="col-xs-6"><strong>Proyecto</strong></div>
  <div  class="col-xs-3"><Strong>Inicio</Strong></div>
  <div  class="col-xs-2"><strong>Objetivos</strong></div>
  
  <div  class="col-xs-6">Proyecto esferica</div>
  <div  class="col-xs-3">12/11/2013</div>
  <div  class="col-xs-2"> ver Objetivos</div>
  </div>
  <!--  cierre de proyecto-->
  <div class="tab-pane" id="profile">
  
  <% 
  Usuario user = null;
  String envio = (String) session.getAttribute("hola");
  
  for(int i=0; i<envio.length();i++)
  {
	  user = new Usuario();
	  String[] datos1 = envio.split("[{]");
	  for (String dato1 : datos1)
	  {
 		  String[] datos2 = dato1.split(":");
		  //String nobre = 
 		  user.setNombre(datos2[1].replace('\"', ' '));
 		  user.setApellido(datos2[2].replace('\"', ' '));
//          user.setEstado(datos2[4].replace('"', ' '));
		  user.setProyecto(Integer.parseInt(datos2[3].replace('\"', ' ')));
 		  user.setEmail(datos2[4].replace('\"', ' '));
  }
	  /*
	  char caracter = envio.charAt(i);
	  if(caracter=='[')
	  {
		  for(int j=i+1; j<envio.length();j++)
		  {
			  char car = envio.charAt(j);
			  if(car == ',')
			  {
				  
			  }
		  }
	  }*/
  
  //ArrayList lista = (ArrayList) session.getAttribute("listuser");

 	//for (int i=0; i<lista.size(); i++)
 	//{
 		//Usuario usuario = (Usuario)lista.get(i);
%>
  
 <div  class="col-xs-6"><%=user.getNombre() %></div> 
  <div  class="col-xs-3">Por Objetivo</div>
  <div  class="col-xs-2">activo</div>
  
<!--    <div  class="col-xs-6">Fabian Miliani</div>
  <div  class="col-xs-3">4 horas</div>
  <div  class="col-xs-2">activo</div>  
  </div>-->
  
<% }

%>
<!--/*termina aqui*/-->
 
</div>
</div>
</div>

</body>
</html>