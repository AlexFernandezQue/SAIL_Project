<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
            <title>Asignacion Equipo Estudiante</title>
            <link rel="stylesheet" href="resources/bower_components/bootstrap/dist/css/bootstrap.min.css"
                  type="text/css"/>
            <link rel="stylesheet" href="resources/bower_components/bootstrap/dist/css/bootstrap-theme.min.css"
                  type="text/css"/>
            <link rel="stylesheet" href="resources/css/estilos.css" type="text/css"/>
            <script src="resources/js/function.js"></script>
            <script src="resources/bower_components/jquery/dist/jquery.min.js"></script>
            <script src="resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
        </head>
        <body>
            <div class="container-fluid">
                <div class="col-md-12">
                    <jsp:include page="/include/menu.jsp"/>
                </div>
                <h:form>
                    <div class="row">
                        <div class="col-md-1" style="background-color:#A9D0F5; height:750px">
                            <br></br><br></br><br></br><br></br><br></br><br></br><br></br>
                        </div>
                        <div class="col-md-10" style="height:auto">
                            <div class="col-md-10">
                                <div align="center">
                                    <br/><br/><br/><br/><br/><br/><font size="4">
                                        <strong>
                                            <font size="5" color="#ff0000">
                                                <h:outputLabel value="Lista Asignaciones Equipo - Estudiante"/>
                                            </font></strong>
                                    </font>
                                     
                                    <br/><br/>
                                </div>
                                
                                <h:dataTable value="#{beanAsignacionEquipo.listaAsignaciones}" var="asignacion" 
                                border="4"
                                                 style="width:800px; color:Black; font-weight:bold; text-align:center; font-size:150%; background-color:ActiveCaption;">
                                    <%-- 
                                        oracle-jdev-comment:Faces.RI.DT.Class.Key:SAIL_Proyecto.asignacionEquipo
                                    --%>
                                    <h:column>
                                        <f:facet name="header">
                                            <h:outputText value="Codigo"/>
                                        </f:facet>
                                        <h:outputText value="#{asignacion.codigo}"/>
                                    </h:column>
                                    <h:column>
                                        <f:facet name="header">
                                            <h:outputText value="Equipo"/>
                                        </f:facet>
                                        <h:outputText value="#{asignacion.equipo.numeroCompu}"/>
                                    </h:column>
                                    <h:column>
                                        <f:facet name="header">
                                            <h:outputText value="Estudiante"/>
                                        </f:facet>
                                        <h:outputText value="#{asignacion.estudiante.nombre}"/>
                                    </h:column>
                                </h:dataTable>
                            </div>
                            <div class="col-md-2">
                                <br/><br/><br/><br/><br/><br/>
                                <h:outputLabel value="Laboratorio"/><br>
                                 <h:selectOneMenu label="Laboratorio" value="#{beanAsignacionEquipo.codigoLab}">
                                    <f:selectItem itemLabel="101" itemValue="1"/>
                                    <f:selectItem itemLabel="102" itemValue="2"/>
                                    <f:selectItem itemLabel="103" itemValue="3"/>
                                    <f:selectItem itemLabel="104" itemValue="4"/>
                                    <f:selectItem itemLabel="105" itemValue="5"/>
                                </h:selectOneMenu>
                                <br><br>
                                <h:outputLabel value="Curso"/><br>
                                 <h:selectOneMenu label="Curso" value="#{beanAsignacionEquipo.codigoCurso}">
                                    <f:selectItem itemLabel="Programacion I" itemValue="1"/>
                                    <f:selectItem itemLabel="Programacion II" itemValue="2"/>
                                    <f:selectItem itemLabel="Programacion III" itemValue="3"/>
                                    <f:selectItem itemLabel="Programacion IV" itemValue="4"/>
                                    <f:selectItem itemLabel="Programacion V" itemValue="5"/>
                                </h:selectOneMenu>
                                <br><br>
                                  <h:outputLabel value="Cuatrimestre"/><br>
                                 <h:selectOneMenu label="Cuatrimestre" value="#{beanAsignacionEquipo.codigoCuatri}">
                                    <f:selectItem itemLabel="I Cuatrimestre" itemValue="1"/>
                                    <f:selectItem itemLabel="II Cuatrimestre" itemValue="2"/>
                                    <f:selectItem itemLabel="III Cuatrimestre" itemValue="3"/>
                                </h:selectOneMenu>
                                <br><br>
                                <h:outputLabel value="Horario"/><br>
                                 <h:selectOneMenu label="Horario" value="#{beanAsignacionEquipo.horario}">
                                    <f:selectItem itemLabel="Mañana" itemValue="1"/>
                                    <f:selectItem itemLabel="Tarde" itemValue="2"/>
                                    <f:selectItem itemLabel="Noche" itemValue="3"/>
                                </h:selectOneMenu>
                                <br><br>
                                <h:outputLabel value="Año"/><br>
                                <h:inputText value="#{beanAsignacionEquipo.annio}"/>
                                 <br><br>
                                 <h:outputLabel value="#{beanAsignacionEquipo.mensaje}"/>
                                 <br><br>
                                 <h:commandButton styleClass="btn btn-info" value="Buscar" style="width:80px;"
                                                  action="#{beanAsignacionEquipo.validarBuscar}"/>
                                                                  
                                <br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Editar" style="width:80px;"
                                                 action="#{beanAsignacionEquipo.ActualizarAsignacion}"/>
                                 
                                <br/><br/>
                                 
                               <h:commandButton styleClass="btn btn-info" value="Nuevo" style="width:80px;"
                                                action="#{beanAsignacionEquipo.nuevaAsigacion}"/>
                                 
                                <br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Ayuda" style="width:80px;"/>
                                 
                                <br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Salir" style="width:80px;"
                                                 action="#{beanAsignacionEquipo.Salir}"/>
                                 
                                <br/><br/><br/>
                            </div>
                        </div>
                        <div class="col-md-1" style="background-color:#A9D0F5; height:750px">
                            <br></br><br></br><br></br><br></br><br></br><br></br><br></br>
                        </div>
                    </div>
                </h:form>
                <div class="col-md-12">
                    <jsp:include page="/include/piePagina.jsp"/>
                </div>
            </div>
        </body>
    </html>
</f:view>