<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
        <html>
                <head>
                        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
                        <title>
                                Mantenimiento Laboratorio
                        </title>
                        <link rel="stylesheet" href="resources/bower_components/bootstrap/dist/css/bootstrap.min.css"
                              type="text/css"/>
                        <link rel="stylesheet"
                              href="resources/bower_components/bootstrap/dist/css/bootstrap-theme.min.css"
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
            <h:form><div class="row">
                <div class="col-md-1" style="background-color:#A9D0F5; height:600px">
                    <br><br><br><br><br><br><br>
                </div>
                <div class="col-md-10" style="height:500px">
                    
                    
                    <div class="col-md-10">
                                <div align="center">
                                  <br/><br/><br/><br/>  <br/><br/><font size="4">
                                        <strong>
                                            <font size="5" color="#ff0000">
                                                <h:outputLabel value="Mantenimiento de Laboratorios UTN"/>
                                            </font></strong>
                                    </font>
                                     
                                    <br/><br/><br/>
                                </div>
                                <div class="row">
                                    <div class="col-md-offset-2 col-md-3">
                                            <h:outputLabel value="Codigo de Laboratorio"/>
                                            <br><br><br>
                                            <h:outputLabel value="Descripcion"/>
                                            <br><br><br>
                                            <h:outputLabel value="Estado"/>
                                            <br><br><br>
                                            <h:outputLabel value="Tipo Laboratorio"/>
                                            <br><br><br>
                                            
                                    </div>
                                    <div class="col-md-7">
                                        <h:inputText style="width:150px;"
                                                     value="#{beanLaboratorio.codigo}"/>
                                        <br><br><br>
                                        <h:inputText readonly="false" style="width:450px;"
                                                     value="#{beanLaboratorio.descripcion}"/>
                                        <br><br><br>
                                        <h:selectOneMenu style="width:450px; font-size:120%;"
                                                         value="#{beanLaboratorio.estado}">
                                                <f:selectItem itemLabel="Activo"
                                                              itemValue="1"/>
                                                <f:selectItem itemLabel="Desactivo"
                                                              itemValue="2"/>
                                                <f:selectItem itemLabel="Reparacion"
                                                              itemValue="3"/>
                                                <f:selectItem itemLabel="Mantenimientos"
                                                              itemValue="4"/>
                                        </h:selectOneMenu>
                                        <br><br><br>
                                        <h:selectOneMenu style="font-size:120%; width:450px;"
                                                         value="#{beanLaboratorio.tipoLaboratorio}">
                                                <f:selectItem itemLabel="Normal"
                                                              itemValue="1"/>
                                                <f:selectItem itemLabel="Practica"
                                                              itemValue="2"/>
                                        </h:selectOneMenu>
                                        <br><br><br>
                                        <h:outputLabel value="#{beanLaboratorio.mensaje}"/>
                                                                        </div>      
                                    
                                </div>
                                
                    </div>
                    
                    <div class="col-md-2">
                               
                                    <br/><br/><br/><br/><br/><br/><br/><br/>
                                    <br/><br/><br/><br/>
                                
                                    <h:commandButton styleClass="btn btn-info" value="Guardar" style="width:80px;"
                                                     action="#{beanLaboratorio.validar}"/>
                                    <br/><br/><br/><br/>
                                    <h:commandButton styleClass="btn btn-info" value="Cancelar" style="width:80px;"/>
                                     <br/><br/><br/><br/>
                                     <h:commandButton styleClass="btn btn-info" value="Salir" style="width:80px;"
                                                      action="#{beanLaboratorio.Salir}"/>
                    </div>
                    
                    
                        </div>
                 <div class="col-md-1" style="background-color:#A9D0F5; height:600px">
                  <br><br><br><br><br><br><br>
                 </div>
            </div>  </h:form>         
            <div class="col-md-12">
                        <jsp:include page="/include/piePagina.jsp"/>
                    </div>
                               
                        </div>
                </body>
        </html>
</f:view>