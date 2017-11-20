<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
            <title>Manejo de Usuario</title>
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
                                                <h:outputLabel value="Lista de Usuarios en el Sistema"/>
                                            </font></strong>
                                    </font>
                                     
                                    <br/><br/>
                                </div>
                                <h:dataTable value="#{beanUsuario.listaUsuario}" var="usuario" border="4"
                                                 style="width:800px; color:Black; font-weight:bold; text-align:center; font-size:150%; background-color:ActiveCaption;">
                                    <%-- 
                                        oracle-jdev-comment:Faces.RI.DT.Class.Key:SAIL_Proyecto.usuario
                                    --%>
                                    <h:column>
                                        <f:facet name="header">
                                            <h:outputText value="Codigo"/>
                                        </f:facet>
                                        <h:outputText value="#{usuario.codigo}"/>
                                    </h:column>
                                    <h:column>
                                        <f:facet name="header">
                                            <h:outputText value="Nombre"/>
                                        </f:facet>
                                        <h:outputText value="#{usuario.nombre}"/>
                                    </h:column>
                                    <h:column>
                                        <f:facet name="header">
                                            <h:outputText value="Correo"/>
                                        </f:facet>
                                        <h:outputText value="#{usuario.correo}"/>
                                    </h:column>
                                </h:dataTable>
                            </div>
                            <div class="col-md-2">
                                <br/><br/><br/><br/><br/><br/>
                                 
                                <h:outputLabel value="Rol"/><br></br>
                                 
                                <h:selectOneMenu label="Rol" value="#{beanUsuario.rol}">
                                    <f:selectItem itemLabel="Administrador" itemValue="1"/>
                                    <f:selectItem itemLabel="Asistente Laboratorio" itemValue="2"/>
                                    <f:selectItem itemLabel="Profesor" itemValue="3"/>
                                    <f:selectItem itemLabel="Estudiante" itemValue="4"/>
                                </h:selectOneMenu>
                                 
                                <br></br>
                                 
                                <h:outputLabel value="Estado"/><br></br>
                                 
                                <h:selectOneMenu label="estado" value="#{beanUsuario.estado}">
                                    <f:selectItem itemLabel="Activo" itemValue="1"/>
                                    <f:selectItem itemLabel="Desactivo" itemValue="2"/>
                                </h:selectOneMenu>
                                 
                                
                                 
                                <br></br><br>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Buscar" style="width:80px;"/>
                                 
                                <br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Editar" style="width:80px;"
                                                 action="#{beanUsuario.ActualizarUsuario}"/>
                                 
                                <br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Nuevo" style="width:80px;"
                                                 action="#{beanUsuario.nuevoUsuario}"/>
                                 
                                <br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Ayuda" style="width:80px;"/>
                                 
                                <br/><br/>
                                 
                                <h:commandButton styleClass="btn btn-info" value="Salir" style="width:80px;"
                                                 action="#{beanUsuario.Salir}"/>
                                 
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