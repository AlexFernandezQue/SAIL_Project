package SAIL_Proyecto.view;

import SAIL_Proyecto.usuario;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class beanSesion extends HttpServlet {
    usuario usu;
    String usuario;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                            throws ServletException, IOException {
                    HttpSession sesion = request.getSession();
                    usuario us1 = (usuario)sesion.getAttribute("usuario");
                    this.setUsu(us1);
                    this.setUsuario(this.getUsu().getNombre());
                request.getRequestDispatcher("principal.jsp").forward(request, response);
            }
    



    public void setUsu(usuario usu) {
        this.usu = usu;
    }

    public usuario getUsu() {
        return usu;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }
}
