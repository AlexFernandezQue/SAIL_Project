package SAIL_Proyecto.view;

import DAO.SNMPExceptions;

import SAIL_Proyecto.asignacionEquipo;
import SAIL_Proyecto.estado;
import SAIL_Proyecto.preguntaClave;
import SAIL_Proyecto.rol;
import SAIL_Proyecto.usuario;

import java.io.IOException;

import java.sql.SQLException;

import java.util.LinkedList;

import javax.faces.context.FacesContext;

import javax.naming.NamingException;

public class beanUsuario {
    String codigo;
    String nombre;
    String correo;
    String contrasena;
    String antiguaContrasena;
    String nuevaContrasena1;
    String nuevaContrasena2;
    int rol;
    int pregunta;
    String respuesta;
    int estado;
    LinkedList<estado>listaEstados = new LinkedList<estado>();
    LinkedList<preguntaClave>listaPreguntas = new LinkedList<preguntaClave>();
    LinkedList<rol>listaRoles = new LinkedList<rol>();
    LinkedList<usuario>listaUsuario = new LinkedList<usuario>();
    String mensaje;
    
    public beanUsuario() {
        this.setContrasena("UTN");
    }
    
    public String validarMantenimiento() throws SNMPExceptions, SQLException, NamingException {
        boolean valido = true;

        if (this.getCodigo().equals("") || this.getNombre().equals("") || this.getCorreo().equals("")){
            valido = false;
        }
        if (valido == false) {
            this.setMensaje("Los campos NUMERO DE IDENTIFACICION, NOMBRE y CORREO ELECTRONICO no pueden quedar en BLANCO");
            this.setCodigo("");
            this.setNombre("");
            this.setCorreo("");
        } else {
            this.setMensaje("DATOS CORRECTAMENTE GUARDADOS");
        }
        return "";
    }
    
    public String validarCambioContrasena() throws SNMPExceptions, SQLException, NamingException {
        boolean valido = true;

        if (this.getAntiguaContrasena().equals("") || this.getNuevaContrasena1().equals("") || this.getNuevaContrasena2().equals("")
        || this.getRespuesta().equals("")){
            valido = false;
        }        
        if (valido == false) {
            this.setMensaje("Los campos ANTIGUA CONTRASEÑA, NUEVA CONTRASEÑA y REPITA NUEVA CONTRASEÑA no pueden quedar en BLANCO");
            this.setAntiguaContrasena("");
            this.setNuevaContrasena1("");
            this.setNuevaContrasena2("");
        } else {
                if(this.getNuevaContrasena1().trim().equals(this.getNuevaContrasena2().trim())){
                    this.setMensaje("DATOS CORRECTAMENTE GUARDADOS");
                }else{
                    this.setMensaje("Las claves no concuerdan");
                }            
        }
        return "";
    }
    
    public String validarPerfilUsuario() throws SNMPExceptions, SQLException, NamingException {
        boolean valido = true;

        if (this.getCodigo().equals("") || this.getNombre().equals("") || this.getCorreo().equals("")
        || this.getRespuesta().equals("")){
            valido = false;
        }
        if (valido == false) {
            this.setMensaje("Los campos NUMERO DE IDENTIFACICION, NOMBRE, CORREO ELECTRONICO y RESPUESTA no pueden quedar en BLANCO");
            this.setCodigo("");
            this.setNombre("");
            this.setCorreo("");
            this.setRespuesta("");
        } else {
            this.setMensaje("DATOS CORRECTAMENTE GUARDADOS");
        }
        return "";
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getRol() {
        return rol;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setListaEstados(LinkedList<estado> listaEstados) {
        this.listaEstados = listaEstados;
    }

    public LinkedList<estado> getListaEstados() {
        return listaEstados;
    }

    public void setListaPreguntas(LinkedList<preguntaClave> listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }

    public LinkedList<preguntaClave> getListaPreguntas() {
        return listaPreguntas;
    }

    public void setListaRoles(LinkedList<rol> listaRoles) {
        this.listaRoles = listaRoles;
    }

    public LinkedList<rol> getListaRoles() {
        return listaRoles;
    }

    public void setListaUsuario(LinkedList<usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public LinkedList<usuario> getListaUsuario() {
        return listaUsuario;
    }
    
    
    public void setAntiguaContrasena(String antiguaContrasena) {
        this.antiguaContrasena = antiguaContrasena;
    }

    public String getAntiguaContrasena() {
        return antiguaContrasena;
    }

    public void setNuevaContrasena1(String nuevaContrasena1) {
        this.nuevaContrasena1 = nuevaContrasena1;
    }

    public String getNuevaContrasena1() {
        return nuevaContrasena1;
    }

    public void setNuevaContrasena2(String nuevaContrasena2) {
        this.nuevaContrasena2 = nuevaContrasena2;
    }

    public String getNuevaContrasena2() {
        return nuevaContrasena2;
    }
    
    public String nuevoUsuario() throws IOException {
        this.setContrasena("UTN");
        String url="modificarUsuario.jsp"; //url donde se redirige la pantalla
                   FacesContext fc=FacesContext.getCurrentInstance();
                   fc.getExternalContext().redirect(url);//redirecciona la página  
        return "";
    }
    
    
    public String ActualizarUsuario() throws IOException {
        String url="modificarUsuario.jsp"; //url donde se redirige la pantalla
                   FacesContext fc=FacesContext.getCurrentInstance();
                   fc.getExternalContext().redirect(url);//redirecciona la página  
        return "";
    }
    
    public String Salir() throws IOException {
        String url="principal.jsp"; //url donde se redirige la pantalla
                   FacesContext fc=FacesContext.getCurrentInstance();
                   fc.getExternalContext().redirect(url);//redirecciona la página  
        return "";
    }
    
    
    public String cambioContraseña() throws IOException {
        String url="modificarClave.jsp"; //url donde se redirige la pantalla
                   FacesContext fc=FacesContext.getCurrentInstance();
                   fc.getExternalContext().redirect(url);//redirecciona la página  
        return "";
    }


    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
