package SAIL_Proyecto.view;

import DAO.SNMPExceptions;

import SAIL_Proyecto.Laboratorio;
import SAIL_Proyecto.LaboratorioDB;
import SAIL_Proyecto.tipoLaboratorio;
import SAIL_Proyecto.tipoLaboratorioDB;
import SAIL_Proyecto.estado;
import SAIL_Proyecto.estadoDB;

import java.io.IOException;

import java.sql.SQLException;

import java.util.LinkedList;

import javax.faces.context.FacesContext;

import javax.naming.NamingException;

public class beanLaboratorio {
    String codigo;
    String descripcion;
    int estado;
    int tipoLaboratorio;
    String mensaje;
    LinkedList<Laboratorio>listaLaboratorios = new LinkedList<Laboratorio>();
    LinkedList<tipoLaboratorio>listaTipoLab = new LinkedList<tipoLaboratorio>();
    LinkedList<estado>listaEstados = new LinkedList<estado>();

    
    public beanLaboratorio() {
    }
    
    public String validar() throws SNMPExceptions, SQLException, NamingException {
        boolean valido = true;

        if (this.getDescripcion().equals("") || this.getCodigo().equals("")){
            valido = false;
        }
        if (valido == false) {
            this.setMensaje("Los campos CODIGO DE LABORATORIO y DESCRIPCION no pueden quedar en BLANCO");
            this.setDescripcion("");
            this.setCodigo("");
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTipoLaboratorio(int tipoLaboratorio) {
        this.tipoLaboratorio = tipoLaboratorio;
    }

    public int getTipoLaboratorio() {
        return tipoLaboratorio;
    }

    public void setListaLaboratorios(LinkedList<Laboratorio> listaLaboratorios) {
        this.listaLaboratorios = listaLaboratorios;
    }

    public LinkedList<Laboratorio> getListaLaboratorios() {
        return listaLaboratorios;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }
    
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setListaTipoLab(LinkedList<tipoLaboratorio> listaTipoLab) {
        this.listaTipoLab = listaTipoLab;
    }

    public LinkedList<tipoLaboratorio> getListaTipoLab() {
        return listaTipoLab;
    }

    public void setListaEstados(LinkedList<estado> listaEstados) {
        this.listaEstados = listaEstados;
    }

    public LinkedList<estado> getListaEstados() {
        return listaEstados;
    }
    

    public String nuevoLab() throws IOException {
        String url="laboratorio.jsp"; //url donde se redirige la pantalla
                   FacesContext fc=FacesContext.getCurrentInstance();
                   fc.getExternalContext().redirect(url);//redirecciona la página  
        return "";
    }
    
    
    public String ActualizarLab() throws IOException {
        String url="laboratorio.jsp"; //url donde se redirige la pantalla
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


}
