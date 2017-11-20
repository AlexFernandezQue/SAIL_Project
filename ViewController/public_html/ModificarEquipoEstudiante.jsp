<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
            <title>Mantenimiento Asignacion Equipo</title>
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
                        <div class="col-md-1" style="background-color:#A9D0F5; height:600px">
                            <br></br><br></br><br></br><br></br><br></br><br></br><br></br>
                        </div>
                        <div class="col-md-10" style="height:auto">
                            <div class="col-md-10">
                                <div align="center">
                                    <br/><br/><br/><br/>
                                     
                                    <br/><br/><font size="4">
                                        <strong>
                                            <font size="5" color="#ff0000">
                                                <h:outputLabel value="Mantenimiento de Laboratorios UTN"/>
                                            </font></strong>
                                    </font>
                                     
                                    <br/><br/><br/><br/>
                                </div>
                                <div class="row">
                                    <div class="col-md-offset-2 col-md-3">
                                        <h:outputLabel value="Numero de Identificacion"/>
                                         <br></br><br><br></br>
                                         
                                        <h:outputLabel value="Nombre"/>
                                         
                                        <br></br><br><br>
                                         
                                        <h:outputLabel value="Numero de Computadora"/>
                                         
                                        <br></br><br></br><br></br>
                                         
                                    
                                    </div>
                                    <div class="col-md-7">
                                        <h:inputText  style="width:150px;"
                                                     value="#{beanAsignacionEquipo.codigo_estudiante}"/>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h:commandButton styleClass="btn btn-info"  value="Buscar"
                                                                                                                                                                                       action="#{beanAsignacionEquipo.validacion}"/>
                                         
                                        <br></br></br></br>
                                         
                                        <h:inputText readonly="false" style="width:450px;"
                                                     value="#{beanAsignacionEquipo.nombre_Estudiante}"/>
                                         
                                        <br></br><br><br>
                                         
                                        <h:selectOneMenu style="width:450px; font-size:120%;"
                                                         value="#{beanAsignacionEquipo.codigoEquipo}">
                                            <f:selectItem itemLabel="Maquina 1" itemValue="1"/>
                                            <f:selectItem itemLabel="Maquina 2" itemValue="2"/>
                                            <f:selectItem itemLabel="Maquina 3" itemValue="3"/>
                                            <f:selectItem itemLabel="Maquina 4" itemValue="4"/>
                                        </h:selectOneMenu>
                                         
                                        <br><br><br>
                                        <h:outputLabel value="#{beanAsignacionEquipo.mensaje}"/>
                                    </div>                                     
                                </div>                                
                            </div>
                            <div class="col-md-2">
                                <p>
                                    <br/><br/><br/><br/><br/><br/><br/><br/>
                                     
                                    <br/><br/><br/><br/>
                                     
                                    <h:commandButton styleClass="btn btn-info" value="Guardar" style="width:80px;"
                                                     action="#{beanAsignacionEquipo.validacion}"/>
                                     
                                    <br/><br/><br/><br/>
                                     
                                    <h:commandButton styleClass="btn btn-info" value="Cancelar" style="width:80px;"/>
                                     
                                    <br/><br/>
                                </p>
                                <p>
                                    &nbsp;
                                </p>
                                <p>
                                    <h:commandButton styleClass="btn btn-info" value="Salir" style="width:80px;"
                                                     action="#{beanAsignacionEquipo.Salir}"/><br/>
                                </p>
                            </div>
                        </div>
                        <div class="col-md-1" style="background-color:#A9D0F5; height:600px">
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