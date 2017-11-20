<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
            <title>Registro de Laboratorio</title>
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
         <h:form><div class="row">
                <div class="col-md-1" style="background-color:#A9D0F5; height:600px">
                    <br><br><br><br><br><br><br>
                </div>
                <div class="col-md-10" style="height:500px">
                    
                    
                    <div class="col-md-10">
                                <div align="center">
                                    <br/><br/><br/><br/><br/><br/><font size="4">
                                        <strong>
                                            <font size="5" color="#ff0000">
                                                <h:outputLabel value="Lista de Laboratorios UTN"/>
                                            </font></strong>
                                    </font>
                                     
                                    <br/><br/>
                                </div><h:dataTable value="#{beanLaboratorio.listaLaboratorios}" var="Laboratorio"
                                                 border="4"
                                                 style="width:800px; color:Black; font-weight:bold; text-align:center; font-size:150%; background-color:ActiveCaption;">
                                <%-- 
                                    oracle-jdev-comment:Faces.RI.DT.Class.Key:SAIL_Proyecto.Laboratorio
                                --%>
                                <h:column>
                                    <f:facet name="header">
                                        <h:outputText value="Codigo"/>
                                    </f:facet>
                                    <h:outputText value="#{Laboratorio.codigo}"/>
                                </h:column>
                                <h:column>
                                    <f:facet name="header">
                                        <h:outputText value="Descripcion"/>
                                    </f:facet>
                                    <h:outputText value="#{Laboratorio.descripcion}"/>
                                </h:column>
                                <h:column>
                                    <f:facet name="header">
                                        <h:outputText value="Tipo"/>
                                    </f:facet>
                                    <h:outputText value="#{Laboratorio.tipo.codigo}"/>
                                </h:column>
                                <h:column>
                                    <f:facet name="header">
                                        <h:outputText value="Estado"/>
                                    </f:facet>
                                    <h:outputText value="#{Laboratorio.estado.descripcion}"/>
                                </h:column>
                            </h:dataTable>
                    </div>
                    
                    <div class="col-md-2">
                               
                                    <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                                
                                    <h:commandButton styleClass="btn btn-info" value="Nuevo" style="width:80px;"
                                                     action="#{beanLaboratorio.nuevoLab}"/>
                                    <br/><br/>
                                    <h:commandButton styleClass="btn btn-info" value="Editar" style="width:80px;"
                                                     action="#{beanLaboratorio.ActualizarLab}"/>
                                    <br/><br/>
                                    <h:commandButton styleClass="btn btn-info" value="Buscar" style="width:80px;"/>
                                    <br/><br/>
                                     <h:commandButton styleClass="btn btn-info" value="Ayuda" style="width:80px;"/>
                                    <br/><br/>
                                     <h:commandButton styleClass="btn btn-info" value="Salir" style="width:80px;"
                                                      action="#{beanLaboratorio.Salir}"/>
                                    <br/><br/><br/>
                                
                            </div>
                    
                    
                        </div>
                 <div class="col-md-1" style="background-color:#A9D0F5; height:600px">
                  <br><br><br><br><br><br><br>
                 </div>
            </div></h:form>          
            <div class="col-md-12">
                        <jsp:include page="/include/piePagina.jsp"/>
                    </div>
                
            </div>
        </body>
    </html>
</f:view>