<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
            <title>Ingreso al Sistema</title>
             <link rel="stylesheet" href="resources/bower_components/bootstrap/dist/css/bootstrap.min.css"
                  type="text/css"/>
            <link rel="stylesheet" href="resources/bower_components/bootstrap/dist/css/bootstrap-theme.min.css"
                  type="text/css"/>
            <link rel="stylesheet" href="resources/css/estilos.css" type="text/css"/>
             <script src="resources/js/function.js"></script>
            <script src="resources/bower_components/jquery/dist/jquery.min.js"></script>
            <script src="resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
        </head>
        <body style='background-image:url("resources/img/logo2.png");'>
         <div class="container-fluid">
                <font size="5">
                    <h:form>
                        <div class="col-md-offset-3 col-md-6" style="background-color:Menu;" id="borde">
                            <div class="row enca">
                                <h4 align="center">
                                    <strong>Inicio de Sesi&oacute;n</strong>
                                </h4>
                            </div>
                            <div class="row">
                                <div class="col-md-offset-2 col-md-8" align="center">
                                    <br/>
                                     
                                    <font color="#c60000">
                                        <strong>
                                            <font size="4">
                                                <h:outputLabel style="width:200px;" value="#{beanIngreso.mensaje}"/>
                                            </font></strong>
                                    </font>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                    <br/><br/>
                                     
                                    <img height="84" width="67" src="resources/img/candado.jpg" id="candadoid"/>
                                     
                                    <br/>
                                </div>
                                <div class="col-md-9">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <br/><br/>
                                             
                                            <strong>
                                                <font color="#000000" size="4">
                                                    <h:outputLabel value="Usuario de Sistema:"/>
                                                </font></strong>
                                        </div>
                                        <div class="col-md-6">
                                            <br/><br/>
                                             
                                            <strong>
                                                <font color="#000000">
                                                    <h:inputText style="width:200px;" value="#{beanIngreso.usuario}"
                                                                 readonly="false"/>
                                                </font></strong>
                                        </div>
                                    </div>
                                    <br/>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <strong>
                                                <font color="#000000" size="4">
                                                    <h:outputLabel value="Clave:"/>
                                                </font></strong>
                                        </div>
                                        <div class="col-md-6">
                                            <strong>
                                                <font color="#000000">
                                                    <h:inputText style="width:200px;" value="#{beanIngreso.clave}"
                                                                 readonly="false"/>
                                                </font></strong>
                                        </div>
                                    </div>
                                    <br/>
                                </div>
                            </div>
                            <div class="row enca" align="center" style="height:110px;">
                                <br/>
                                 
                                <strong>
                                    <h:commandButton value="Continuar" style="color: #fff;background-color: #337ab7;
  border-color: #2e6da4;  padding: 8px 12px;
  font-size: 18px;
  line-height: 1.3333333;
  border-radius: 6px;" id="btnAceptar" action="#{beanIngreso.ingreso}"/></strong>
                                 &nbsp;&nbsp;&nbsp;<strong>
                                    <h:commandButton style="color: #fff;background-color: #337ab7;
  border-color: #2e6da4;  padding: 8px 12px;
  font-size: 18px;
  line-height: 1.3333333;
  border-radius: 6px;" value="Cancelar"/></strong>
                                 
                                <br>
                                 
                                <a href="olvidarClave.jsp" style="color:white; font-weight: bold; font-size: 16px">He olvidado la
                                                                                                   contrase&ntilde;a</a>
                                 
                                <br/>
                            </div>
                        </div>
                    </h:form>
                </font>
        </div>
        </body>
    </html>
</f:view>