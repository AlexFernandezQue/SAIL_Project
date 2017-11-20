<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
            
            <meta name="viewport" content="width=device-width" />	
	<link rel="stylesheet" href="../resources/bower_components/bootstrap/dist/css/bootstrap.min.css">
 	<link rel="stylesheet" href="../resources/bower_components/bootstrap/dist/css/bootstrap-theme.min.css">
	<script src="../resources/bower_components/jquery/dist/jquery.min.js"></script>
	<script src="../resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<link href="../resources/css/style.css" rel="stylesheet">
        </head>
        <body>
            <h:form>
                <html>
                <head>
    

                </head>
                <body>

                     <div class="container-fluid"">
				<div class="col-md-12 nav navbar-fixed-top" id="menu-wrap" >    
					<a class="navbar-brand" href="index.html"><img class="logoUTN" src="../resources/img/logo.png" alt="Basica"></a>
					<ul id="menu">
						<li><a href="principal.jsp">Pagina Principal</a></li>

						<li>
							<a href="">Laboratorio</a>
							<ul>
								<li>
									<a href="">Cambiar Equipo</a>
								</li>
								<li>
									<a href="">Programar Mantenimiento</a>			
								</li>
							</ul>
						</li>
						
						<li>
							<a href="">Distribución</a>
							<ul>
								<li>
									<a href="asignacionLaboratorio.jsp">Asignar Laboratorio</a>			
								</li>
								<li>
									<a href="equipoEstudiante.jsp">Asignar Equipo a Estudiante</a>				
								</li>
								<li>
									<a href="">Consultar Disponibilidad</a>				
								</li>
								<li>
									<a href="prestamoLaboratorio.jsp">Gestionar Prestamo Laboratorio</a>				
								</li>
                                                                <li>
									<a href="prestamoLaboratorioPractica.jsp">Prestamo Laboratorio de Practicas</a>				
								</li>
							</ul>
						</li>
						
						<li>
							<a href="">Solicitudes</a>
							<ul>
								<li>
									<a href="reporteAverias.jsp">Reportar Averias</a>			
								</li>
								<li>
									<a href="">Solicitar mantenimiento de Software</a>				
								</li>

								<li>
									<a href="">Solicitar Equipo Adicional</a>			
								</li>
							</ul>
						</li>
						
						<li>
							<a href="">Mantenimientos</a>
							<ul>
								<li>
									<a href="">Manipular Roles</a>
                                                                    			
								</li>
								<li>
									<a href="">Manipular Permisos</a>

                                                                    			
								</li>
								<li>
									<a href="ManejoUsuarios.jsp">Manipular Usuarios</a>
                                                                    				
								</li>
								<li>
									<a href="">Gestionar Equipos</a>				
									
								</li>
								<li>
									<a href="registroLaboratorio.jsp">Gestionar Laboratorios</a>				
										
								</li>
								<li>
									<a href="">Gestionar Cursos</a>				
									
								</li>
							</ul>
						</li>
						
						<li>
							<a href="">Reportes</a>
							<ul>
								<li>
									<a href="">Consultar Equipo</a>			
								</li>
								<li>
									<a href="">Consultar Disponibilidad de Laboratorio</a>			
								</li>

								<li>
									<a href="">Consultar Historico de Averias</a>			
								</li>
								<li>
									<a href="">Consultar Distribucion de Laboratorio</a>					
								</li>
							</ul>
						</li>
                                                <li><a href="perfilUsuario.jsp">Richard</a></li>
                                                <li><a href="ingreso.jsp">Log out</a></li>
						
					</ul>
				</div>
                        </div>
            </h:form>
        </body>
    </html>
</f:view>
                            
                        
                            
                        