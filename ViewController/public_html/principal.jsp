<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
            <title>Pagina Principal</title>
            <link rel="stylesheet" href="resources/bower_components/bootstrap/dist/css/bootstrap.min.css">
 	<link rel="stylesheet" href="resources/bower_components/bootstrap/dist/css/bootstrap-theme.min.css">
	<script src="resources/bower_components/jquery/dist/jquery.min.js"></script>
	<script src="resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
        </head>
        <body>
        <div class="container-fluid">
            <h:form>
            <div class="col-md-12">
                        <jsp:include page="/include/menu.jsp"/>
            </div>
            <div class="row">
                <div class="col-md-1" style="background-color:#A9D0F5; height:600px">
                    <br><br><br><br><br><br><br>
                </div>
                <div class="col-md-10"
                     style='border:solid medium black; height:600px; background-image:url("resources/img/fotoUTN.jpg"); background-repeat:no-repeat;'>
                    
                </div>
                 <div class="col-md-1" style="background-color:#A9D0F5; height:600px"> 
                  <br><br><br><br><br><br><br>
                 </div>
            </div>          
            <div class="col-md-12">
                        <jsp:include page="/include/piePagina.jsp"/>
            </div>
            </h:form>
        </div>
        </body>
    </html>
</f:view>