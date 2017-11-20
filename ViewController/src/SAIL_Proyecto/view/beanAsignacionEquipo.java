package SAIL_Proyecto.view;


import DAO.SNMPExceptions;

import SAIL_Proyecto.asignacionEquipo;
import SAIL_Proyecto.equipo;
import SAIL_Proyecto.curso;
import SAIL_Proyecto.cuatrimestre;

import java.io.IOException;

import java.sql.SQLException;

import java.util.LinkedList;

import javax.faces.context.FacesContext;

import javax.naming.NamingException;

import javax.swing.JOptionPane;

public class beanAsignacionEquipo {

    int codigo;
    String codigo_estudiante;
    String nombre_Estudiante;
    int codigo_asig_Lab;
    int codigoEquipo;
    int codigoLab;
    int codigoCurso;
    int codigoCuatri;
    int horario;
    String annio;
    LinkedList<asignacionEquipo> listaAsignaciones = new LinkedList<asignacionEquipo>();
    LinkedList<equipo> listaEquipos = new LinkedList<equipo>();
    LinkedList<curso> listaCursos = new LinkedList<curso>();
    LinkedList<cuatrimestre> listaCuatrimestre = new LinkedList<cuatrimestre>();
    String mensaje;

    public beanAsignacionEquipo() {
    }
    
    public String validacion() {
        boolean valido = true;

        if (this.getCodigo_estudiante().equals("") || this.getNombre_Estudiante().equals("")){
            valido = false;
        }
        if (valido == false) {
            this.setMensaje("Los campos NUMERO DE IDENTIFICACION y NOMBRE no pueden quedar en BLANCO");
            this.setCodigo_estudiante("");
            this.setNombre_Estudiante("");
        } else {
            this.setMensaje("DATOS CORRECTAMENTE GUARDADOS");
        }
        return "";
    }

    public String validarBuscar() throws SNMPExceptions, SQLException, NamingException {
        boolean valido = true;

        if (this.getAnnio().equals("")){
            valido = false;
        }
        if (valido == false) {
            this.setMensaje("El campo Año no puede quedar en BLANCO");
            this.setAnnio("");
        } else {
            this.setMensaje("Buscando");
        }
        return "";
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo_asig_Lab(int codigo_asig_Lab) {
        this.codigo_asig_Lab = codigo_asig_Lab;
    }

    public int getCodigo_asig_Lab() {
        return codigo_asig_Lab;
    }

    public void setCodigoEquipo(int codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public int getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setListaAsignaciones(LinkedList<asignacionEquipo> listaAsignaciones) {
        this.listaAsignaciones = listaAsignaciones;
    }

    public LinkedList<asignacionEquipo> getListaAsignaciones() {
        return listaAsignaciones;
    }

    public void setCodigoLab(int codigoLab) {
        this.codigoLab = codigoLab;
    }

    public int getCodigoLab() {
        return codigoLab;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCuatri(int codigoCuatri) {
        this.codigoCuatri = codigoCuatri;
    }

    public int getCodigoCuatri() {
        return codigoCuatri;
    }

    public void setAnnio(String annio) {
        this.annio = annio;
    }

    public String getAnnio() {
        return annio;
    }

    public void setListaEquipos(LinkedList<equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public LinkedList<equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaCursos(LinkedList<curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public LinkedList<curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCuatrimestre(LinkedList<cuatrimestre> listaCuatrimestre) {
        this.listaCuatrimestre = listaCuatrimestre;
    }

    public LinkedList<cuatrimestre> getListaCuatrimestre() {
        return listaCuatrimestre;
    }

    public void setCodigo_estudiante(String codigo_estudiante) {
        this.codigo_estudiante = codigo_estudiante;
    }

    public String getCodigo_estudiante() {
        return codigo_estudiante;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getHorario() {
        return horario;
    }

    public void setNombre_Estudiante(String nombre_Estudiante) {
        this.nombre_Estudiante = nombre_Estudiante;
    }

    public String getNombre_Estudiante() {
        return nombre_Estudiante;
    }

    public String nuevaAsigacion() throws IOException {
        String url = "ModificarEquipoEstudiante.jsp"; //url donde se redirige la pantalla
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.getExternalContext().redirect(url); //redirecciona la página
        return "";
    }


    public String ActualizarAsignacion() throws IOException {
        String url = "ModificarEquipoEstudiante.jsp"; //url donde se redirige la pantalla
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.getExternalContext().redirect(url); //redirecciona la página
        return "";
    }

    public String Salir() throws IOException {
        String url = "principal.jsp"; //url donde se redirige la pantalla
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.getExternalContext().redirect(url); //redirecciona la página
        return "";
    }


    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
