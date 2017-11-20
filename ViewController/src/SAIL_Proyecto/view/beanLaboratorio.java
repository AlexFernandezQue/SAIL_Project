package SAIL_Proyecto.view;

import SAIL_Proyecto.Laboratorio;
import SAIL_Proyecto.LaboratorioDB;
import SAIL_Proyecto.tipoLaboratorio;
import SAIL_Proyecto.tipoLaboratorioDB;
import SAIL_Proyecto.estado;
import SAIL_Proyecto.estadoDB;

import java.io.IOException;

import java.util.LinkedList;

import javax.faces.context.FacesContext;

public class beanLaboratorio {
    int codigo;
    String descripcion;
    int estado;
    int tipoLaboratorio;
    String mensaje;
    LinkedList<Laboratorio>listaLaboratorios = new LinkedList<Laboratorio>();
    LinkedList<tipoLaboratorio>listaTipoLab = new LinkedList<tipoLaboratorio>();
    LinkedList<estado>listaEstados = new LinkedList<estado>();

    
    public beanLaboratorio() {
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
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
