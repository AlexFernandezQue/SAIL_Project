package SAIL_Proyecto.view;

import SAIL_Proyecto.Laboratorio;
import SAIL_Proyecto.horario;
import SAIL_Proyecto.cuatrimestre;
import SAIL_Proyecto.curso;
import SAIL_Proyecto.usuario;
import SAIL_Proyecto.asignacionLaboratorio;

import java.io.IOException;

import java.util.LinkedList;

import javax.faces.context.FacesContext;


public class beanAsignacionLab {
    
    int codigo;
    int horario;
    String profesor;
    int curso;
    int lab;
    int cuatri;
    String annio;
    String mensaje;
    
    LinkedList<asignacionLaboratorio>listaAsignacionLaboratorio = new LinkedList<asignacionLaboratorio>();
    LinkedList<horario>listaHorario = new LinkedList<horario>();
    LinkedList<usuario>listaUsuarios = new LinkedList<usuario>();
    LinkedList<curso>listaCursos = new LinkedList<curso>();
    LinkedList<Laboratorio>listaLaboratorio = new LinkedList<Laboratorio>();
    LinkedList<cuatrimestre>listaCuatrimestre = new LinkedList<cuatrimestre>();
    
    public beanAsignacionLab() {
    }
    
    public String validacion() {
        boolean valido = true;

        if (this.getAnnio().equals("")){
            valido = false;
        }
        if (valido == false) {
            this.setMensaje("El campo AÑO no puede quedar en BLANCO");
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

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getHorario() {
        return horario;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }

    public void setLab(int lab) {
        this.lab = lab;
    }

    public int getLab() {
        return lab;
    }

    public void setCuatri(int cuatri) {
        this.cuatri = cuatri;
    }

    public int getCuatri() {
        return cuatri;
    }

    public void setAnnio(String annio) {
        this.annio = annio;
    }

    public String getAnnio() {
        return annio;
    }

    public void setListaHorario(LinkedList<horario> listaHorario) {
        this.listaHorario = listaHorario;
    }

    public LinkedList<horario> getListaHorario() {
        return listaHorario;
    }

    public void setListaUsuarios(LinkedList<usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public LinkedList<usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaCursos(LinkedList<curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public LinkedList<curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaLaboratorio(LinkedList<Laboratorio> listaLaboratorio) {
        this.listaLaboratorio = listaLaboratorio;
    }

    public LinkedList<Laboratorio> getListaLaboratorio() {
        return listaLaboratorio;
    }

    public void setListaCuatrimestre(LinkedList<cuatrimestre> listaCuatrimestre) {
        this.listaCuatrimestre = listaCuatrimestre;
    }

    public LinkedList<cuatrimestre> getListaCuatrimestre() {
        return listaCuatrimestre;
    }

    public void setListaAsignacionLaboratorio(LinkedList<asignacionLaboratorio> listaAsignacionLaboratorio) {
        this.listaAsignacionLaboratorio = listaAsignacionLaboratorio;
    }

    public LinkedList<asignacionLaboratorio> getListaAsignacionLaboratorio() {
        return listaAsignacionLaboratorio;
    }
    
    public String nuevaAsigacionLab() throws IOException {
        String url="modificarAsignacionLaboratorio.jsp"; //url donde se redirige la pantalla
                   FacesContext fc=FacesContext.getCurrentInstance();
                   fc.getExternalContext().redirect(url);//redirecciona la página  
        return "";
    }
    
    
    public String ActualizarAsignacionLab() throws IOException {
        String url="modificarAsignacionLaboratorio.jsp"; //url donde se redirige la pantalla
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

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
