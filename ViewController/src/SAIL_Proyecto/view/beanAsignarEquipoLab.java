package SAIL_Proyecto.view;

import SAIL_Proyecto.Laboratorio;
import SAIL_Proyecto.equipo;
import SAIL_Proyecto.dispositivo;

import java.io.IOException;

import java.util.LinkedList;

import javax.faces.context.FacesContext;

public class beanAsignarEquipoLab {
    int laboratorio;
    int equipo;
    int dispositivo;
    
    LinkedList<Laboratorio>listaLaboratorios = new LinkedList<Laboratorio>();
    LinkedList<equipo>listaEquipos = new LinkedList<equipo>();
    LinkedList<dispositivo>listaDispositivo = new LinkedList<dispositivo>();
    public beanAsignarEquipoLab() {
    }

    public void setLaboratorio(int laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getLaboratorio() {
        return laboratorio;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setDispositivo(int dispositivo) {
        this.dispositivo = dispositivo;
    }

    public int getDispositivo() {
        return dispositivo;
    }

    public void setListaLaboratorios(LinkedList<Laboratorio> listaLaboratorios) {
        this.listaLaboratorios = listaLaboratorios;
    }

    public LinkedList<Laboratorio> getListaLaboratorios() {
        return listaLaboratorios;
    }

    public void setListaEquipos(LinkedList<equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public LinkedList<equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaDispositivo(LinkedList<dispositivo> listaDispositivo) {
        this.listaDispositivo = listaDispositivo;
    }

    public LinkedList<dispositivo> getListaDispositivo() {
        return listaDispositivo;
    }
    
    public String nuevoEquipo() throws IOException {
        String url="AsignarEquiposLaboratorio.jsp"; //url donde se redirige la pantalla
                   FacesContext fc=FacesContext.getCurrentInstance();
                   fc.getExternalContext().redirect(url);//redirecciona la página  
        return "";
    }
    
    
    public String ActualizarEquipob() throws IOException {
        String url="AsignarEquiposLaboratorio.jsp"; //url donde se redirige la pantalla
                   FacesContext fc=FacesContext.getCurrentInstance();
                   fc.getExternalContext().redirect(url);//redirecciona la página  
        return "";
    }
    
    public String nuevoDispositivo() throws IOException {
        String url="AsignarDispositivosLaboratorio.jsp"; //url donde se redirige la pantalla
                   FacesContext fc=FacesContext.getCurrentInstance();
                   fc.getExternalContext().redirect(url);//redirecciona la página  
        return "";
    }
    
    
    public String ActualizarDispositivo() throws IOException {
        String url="AsignarDispositivosLaboratorio.jsp"; //url donde se redirige la pantalla
                   FacesContext fc=FacesContext.getCurrentInstance();
                   fc.getExternalContext().redirect(url);//redirecciona la página  
        return "";
    }
}
