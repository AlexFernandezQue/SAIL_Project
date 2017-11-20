package SAIL_Proyecto.view;

import SAIL_Proyecto.Laboratorio;
import SAIL_Proyecto.equipo;
import SAIL_Proyecto.tipoServicio;

import java.io.IOException;

import java.util.LinkedList;

import javax.faces.context.FacesContext;

public class beanReporteAverias {
    
    int codigo;
    String Descripcion;
    String usuario;
    int codigoCompu;
    int tipoServicio;
    int laboratorio;
    String fechaInicio;
    String fechaFinal;
    LinkedList<tipoServicio>listaServicios = new LinkedList<tipoServicio>();
    LinkedList<equipo>listaEquipos = new LinkedList<equipo>();
    LinkedList<Laboratorio>listaLaboratorio = new LinkedList<Laboratorio>();
    
    public beanReporteAverias() {
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
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public String Salir() throws IOException {
        String url="principal.jsp"; //url donde se redirige la pantalla
                   FacesContext fc=FacesContext.getCurrentInstance();
                   fc.getExternalContext().redirect(url);//redirecciona la página  
        return "";
    }

  
}
