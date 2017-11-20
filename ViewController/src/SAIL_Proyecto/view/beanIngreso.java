package SAIL_Proyecto.view;

import java.io.IOException;
import SAIL_Proyecto.usuario;
import SAIL_Proyecto.estado;
import SAIL_Proyecto.rol;

import javax.faces.component.html.HtmlForm;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class beanIngreso{
    String usuario;
    String clave;
    String mensaje;


    public beanIngreso() {
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
    
    public String ingreso(){
        String cadena = "no";
        if (!this.getUsuario().equals("Proyecto")) {
            this.setMensaje("Usuario Invalido");
        } else {
            if (!this.getClave().equals("1234")) {
                this.setMensaje("Clave Invalida");
            } else {
                cadena ="si";
                
            }
        }
        
        return cadena;
    }
    
}
