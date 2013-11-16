<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html>
<head>
<meta charset="utf-8">
<title>yeswork.com</title>
<link href="css/general.css" rel="stylesheet" type="text/css">


<link href="dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="dist/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">


<meta name="viewport" content="width=device-width, initial-scale=1.0">

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
<p> <%${correo}%> </p>
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
<div  class="col-xs-6">Daniela Beltran</div>
  <div  class="col-xs-3">Por Objetivo</div>
  <div  class="col-xs-2">activo</div>
  
  <div  class="col-xs-6">Fabian Miliani</div>
  <div  class="col-xs-3">4 horas</div>
  <div  class="col-xs-2">activo</div>  
  </div>
  

<!--/*termina aqui*/-->

</div>
</div>
</div>
</body>
</html>
