<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
            <title>Asignaci&oacute;n de Laboratorio</title>
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
                        <div class="col-md-1" style="background-color:#A9D0F5; height:700px">
                            <br></br><br></br><br></br><br></br><br></br><br></br><br></br>
                        </div>
                        <div class="col-md-10" style="height:auto">
                        </br><br></br><br><br>
                            <div class="col-md-10">
                                <div align="center">
                                    <br/><font size="4">
                                        <strong>
                                            <font size="5" color="#ff0000">
                                                <h:outputLabel value="Lista de Asignaciones de Laboratorios UTN"/>
                                            </font></strong>
                                    </font>
                                     
                                    <br/><br/>
                                </div>
                                <h:dataTable value="#{beanAsignacionLab.listaAsignacionLaboratorio}" var="asignacion"
                                border="4"
                                                 style="width:800px; color:Black; font-weight:bold; text-align:center; font-size:150%; background-color:ActiveCaption;">
                                    <%-- 
                                        oracle-jdev-comment:Faces.RI.DT.Class.Key:SAIL_Proyecto.asignacionLaboratorio
                                    --%>
                                    <h:column>
                                        <f:facet name="header">
                                            <h:outputText value="Codigo" style="width:auto;"/>
                                        </f:facet>
                                        <h:outputText value="#{asignacion.codigo}"/>
                                    </h:column>
                                    <h:column>
                                        <f:facet name="header">
                                            <h:outputText value="Lab"/>
                                        </f:facet>
                                        <h:outputText value="#{asignacion.lab.codigo}"/>
                                    </h:column>
                                    <h:column>
                                        <f:facet name="header">
                                            <h:outputText value="Curso"/>
                                        </f:facet>
                                        <h:outputText value="#{asignacion.curso.descripcion}"/>
                                    </h:column>
                                    <h:column>
                                        <f:facet name="header">
                                            <h:outputText value="Profesor"/>
                                        </f:facet>
                                        <h:outputText value="#{asignacion.profesor.nombre}"/>
                                    </h:column>
                                </h:dataTable>
                            </div>
                            <div class="col-md-2">
                                <br/><br/>
                                
                                <h:outputLabel value="Cuatrimestre"/><br>
                                 <h:selectOneMenu label="Cuatrimestre" value="#{beanAsignacionLab.cuatri}">
                                    <f:selectItem itemLabel="I Cuatrimestre" itemValue="1"/>
                                    <f:selectItem itemLabel="II Cuatrimestre" itemValue="2"/>
                                    <f:selectItem itemLabel="III Cuatrimestre" itemValue="3"/>
                                </h:selectOneMenu>
                                <br><br>
                                <h:outputLabel value="Horario"/><br>
                                 <h:selectOneMenu label="Horario" value="#{beanAsignacionLab.horario}">
                                    <f:selectItem itemLabel="Mañana" itemValue="1"/>
                                    <f:selectItem itemLabel="Tarde" itemValue="2"/>
                                    <f:selectItem itemLabel="Noche" itemValue="3"/>
                                </h:selectOneMenu>
                                <br><br>
                                <h:outputLabel value="Año"/><br>
                                <h:inputText value="#{beanAsignacionLab.annio}"/>
                                
                                <br><br><br>
                                <h:commandButton styleClass="btn btn-info" value="Buscar" style="width:80px;"/>
                                
                                 
                                <br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Editar" style="width:80px;"
                                                 action="#{beanAsignacionLab.ActualizarAsignacionLab}"/>
                                 
                                <br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Nuevo" style="width:80px;"
                                                 action="#{beanAsignacionLab.nuevaAsigacionLab}"/>
                                 
                                <br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Ayuda" style="width:80px;"/>
                                 
                                <br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Salir" style="width:80px;"
                                                 action="#{beanAsignacionLab.Salir}"/>
                                 
                                <br/><br/><br/>
                            </div>
                        </div>
                        <div class="col-md-1" style="background-color:#A9D0F5; height:700px">
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