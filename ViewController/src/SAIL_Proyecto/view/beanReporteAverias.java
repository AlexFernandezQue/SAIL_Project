package SAIL_Proyecto.view;

import DAO.SNMPExceptions;

import SAIL_Proyecto.Laboratorio;
import SAIL_Proyecto.equipo;
import SAIL_Proyecto.tipoServicio;

import java.io.IOException;

import java.sql.SQLException;

import java.util.LinkedList;

import javax.faces.context.FacesContext;

import javax.naming.NamingException;

public class beanReporteAverias {
    
    int codigo;
    String Descripcion;
    int usuario;
    int codigoCompu;
    int tipoServicio;
    int laboratorio;
    String fechaInicio;
    String fechaFinal;
    LinkedList<tipoServicio>listaServicios = new LinkedList<tipoServicio>();
    LinkedList<equipo>listaEquipos = new LinkedList<equipo>();
    LinkedList<Laboratorio>listaLaboratorio = new LinkedList<Laboratorio>();
    String mensaje;
    
    public beanReporteAverias() {
    }
    
    public String validar() throws SNMPExceptions, SQLException, NamingException {
        boolean valido = true;

        if (this.getDescripcion().equals("")){
            valido = false;
        }
        if (valido == false) {
            this.setMensaje("El campo DESCRIPCION no puede quedar en BLANCO");
        } else {
            this.setMensaje("DATOS CORRECTAMENTE GUARDADOS");
        }
        return "";
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setCodigoCompu(int codigoCompu) {
        this.codigoCompu = codigoCompu;
    }

    public int getCodigoCompu() {
        return codigoCompu;
    }

    public void setTipoServicio(int tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public int getTipoServicio() {
        return tipoServicio;
    }

    public void setLaboratorio(int laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getLaboratorio() {
        return laboratorio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setListaServicios(LinkedList<tipoServicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public LinkedList<tipoServicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaEquipos(LinkedList<equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public LinkedList<equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaLaboratorio(LinkedList<Laboratorio> listaLaboratorio) {
        this.listaLaboratorio = listaLaboratorio;
    }

    public LinkedList<Laboratorio> getListaLaboratorio() {
        return listaLaboratorio;
    }
    
    public String Salir() throws IOException {
        String url="principal.jsp"; //url donde se redirige la pantalla
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
