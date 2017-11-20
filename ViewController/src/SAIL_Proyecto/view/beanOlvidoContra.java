package SAIL_Proyecto.view;

import java.io.IOException;

import javax.faces.context.FacesContext;


public class beanOlvidoContra {
    
    String usuario;
    String clave1;
    String clave2;
    String mensaje;
    int preguntaClave;
    String respuesta;
    
    static String miUsuario;
    
    public beanOlvidoContra() {
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setPreguntaClave(int preguntaClave) {
        this.preguntaClave = preguntaClave;
    }

    public int getPreguntaClave() {
        return preguntaClave;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public static void setMiUsuario(String miUsuario) {
        beanOlvidoContra.miUsuario = miUsuario;
    }

    public static String getMiUsuario() {
        return miUsuario;
    }
    
    public void setClave1(String clave1) {
        this.clave1 = clave1;
    }

    public String getClave1() {
        return clave1;
    }

    public void setClave2(String clave2) {
        this.clave2 = clave2;
    }

    public String getClave2() {
        return clave2;
    }
    
    public String OlvidoClave(){
        String cadena = "no";
        if (!this.getUsuario().equals("Proyecto")) {
            this.setMensaje("Usuario Invalido");
        } else {
            if (this.getPreguntaClave() == 4 && this.getRespuesta().trim().equals("Azul")) {
                cadena = "si";
            } else {
                this.setMensaje("Datos invalidos");
            }
        }
        return cadena;
    }
    
    public String CambioClave(){
        String cadena = "no";
        
        if(this.getClave1().trim().equals(this.getClave2().trim())){
            cadena = "si";
        }else{
            this.setMensaje("Las claves no concuerdan");
        }
        
        return cadena;
    }

   
    public String cancelar() throws IOException {
        String url="ingreso.jsp"; //url donde se redirige la pantalla
                   FacesContext fc=FacesContext.getCurrentInstance();
                   fc.getExternalContext().redirect(url);//redirecciona la página  
        return "";
    }
}


