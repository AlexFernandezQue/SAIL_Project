<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
            <title>Cambio de Contraseña</title>
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
            <h:form>
                <div class="col-md-offset-3 col-md-6" style="background-color:Menu;" id="borde">
                        <div class="row enca">
                            <h4 align="center">
                                <strong>Inicio de Sesi&oacute;n</strong>
                            </h4>
                        </div>
                        <div class="row">
                            <div class="col-md-offset-2 col-md-8" align="center">
                               <br></br>
                                 
                                
                                <font size="7" color="#c60000">
                                    <strong>
                                        <font size="4">
                                            <h:outputLabel style="width:300px;" value="#{beanOlvidoContra.mensaje}"/>
                                        </font></strong>
                                </font>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-3">
                                <br></br><br></br>
                                 
                                <img height="84" width="67" src="resources/img/candado.jpg" id="candadoid"/>
                                 
                                <br></br>
                            </div>
                            <div class="col-md-9">
                                <div class="row">
                                    <div class="col-md-6">
                                        <br/>
                                         
                                        <strong>
                                            <font size="4" color="#000000">
                                                <h:outputLabel value="Digite su nueva clave:"/>
                                            </font></strong>
                                    </div>
                                    <div class="col-md-6">
                                        <br/>
                                         
                                        <font size="4">
                                            <strong>
                                                <font color="#000000">
                                                    <h:inputText style="width:200px;"
                                                                 value="#{beanOlvidoContra.clave1}"
                                                                 readonly="false"/>
                                                </font></strong>
                                        </font>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <br/><br/>
                                         
                                        <strong>
                                            <font size="4" color="#000000">
                                                <h:outputLabel value="Vuelva a digitar la clave:"/>
                                            </font></strong>
                                    </div>
                                    <div class="col-md-6">
                                        <br/><br/>
                                
                                                    
                                         <font size="4">
                                            <strong>
                                                <font color="#000000">
                                                    <h:inputText style="width:200px;"
                                                                 value="#{beanOlvidoContra.clave2}"
                                                                 readonly="false"/>
                                                </font></strong>
                                        </font>
                                       
                                    </div>
                                </div>

                                <br></br>
                            </div>
                        </div>
                        <div class="row enca" align="center" style="height:90px;">
                            <br>
                             
                            <font size="3">
                                <strong>
                                    <h:commandButton value="Continuar" style="color: #fff;background-color: #337ab7;
  border-color: #2e6da4;  padding: 8px 12px;
  font-size: 18px;
  line-height: 1.3333333;
  border-radius: 6px;" id="btnAceptar" action="#{beanOlvidoContra.CambioClave}"/></strong>
                            </font>
                             &nbsp;&nbsp;&nbsp;<font size="3">
                                <strong>
                                    <h:commandButton style="color: #fff;background-color: #337ab7;
  border-color: #2e6da4;  padding: 8px 12px;
  font-size: 18px;
  line-height: 1.3333333;
  border-radius: 6px;" value="Cancelar" action="#{beanOlvidoContra.cancelar}"/></strong>
                            </font>
                             
                            <br></br>
                            
                    
                        </div>
                    </div>
            </h:form>
        </div>
        </body>
    </html>
</f:view>