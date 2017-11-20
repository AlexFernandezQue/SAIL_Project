<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
            <title>Reporte de Averias</title>
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
                                                <h:outputLabel value="Reporte de Averias"/>
                                            </font></strong>
                                    </font>
                                     
                                    <br/><br/><br/>
                                </div>
                                <div class="row">
                                    <div class="col-md-offset-2 col-md-3">
                                        <h:outputLabel value="Numero de Laboratorio"/>
                                         
                                        <br></br><br></br>
                                         
                                        <h:outputLabel value="Mantenimiento"/>
                                         
                                        <br></br><br></br>
                                         
                                        <h:outputLabel value="Numero de computadora"/>
                                         
                                        <br></br><br></br>
                                         
                                        <h:outputLabel value="Descripcion"/>
                                         
                                        <br></br><br></br>
                                    </div>
                                    <div class="col-md-7">
                                        <h:selectOneMenu style="width:450px; font-size:120%;"
                                                         value="#{beanReporteAverias.laboratorio}">
                                            <f:selectItem itemLabel="101" itemValue="1"/>
                                            <f:selectItem itemLabel="102" itemValue="2"/>
                                            <f:selectItem itemLabel="103" itemValue="3"/>
                                            <f:selectItem itemLabel="104" itemValue="4"/>
                                        </h:selectOneMenu>
                                         
                                        <br></br><br></br>
                                         
                                         <h:selectOneMenu style="width:450px; font-size:120%;"
                                                         value="#{beanReporteAverias.tipoServicio}">
                                            <f:selectItem itemLabel="Averia" itemValue="1"/>
                                            <f:selectItem itemLabel="Actualizar Software" itemValue="2"/>
                                            <f:selectItem itemLabel="Instalar Software" itemValue="3"/>
                                        </h:selectOneMenu>
                                         
                                        <br></br><br></br>
                                         
                                        <h:selectOneMenu style="width:450px; font-size:120%;"
                                                         value="#{beanReporteAverias.codigoCompu}">
                                            <f:selectItem itemLabel="1" itemValue="1"/>
                                            <f:selectItem itemLabel="2" itemValue="2"/>
                                            <f:selectItem itemLabel="3" itemValue="3"/>
                                            <f:selectItem itemLabel="4" itemValue="4"/>
                                        </h:selectOneMenu>
                                         
                                        <br></br><br></br>
                                         
                                        <h:inputText style="width:450px;"
                                                     value="#{beanReporteAverias.descripcion}"/>
                                        
                                        <br></br><br></br>
                                        
                                        <h:outputLabel value="#{beanReporteAverias.mensaje}"/>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-2">
                                <br/><br/><br/><br/><br/><br/>
                                 
                                <br/><br/><br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Guardar" style="width:80px;"
                                                 action="#{beanReporteAverias.validar}"/>
                                 
                                <br/><br/><br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Cancelar" style="width:80px;"/>
                                 
                                <br/><br/><br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Salir" style="width:80px;"
                                                 action="#{beanReporteAverias.Salir}"/>
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