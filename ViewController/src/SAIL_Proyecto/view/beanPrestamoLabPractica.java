package SAIL_Proyecto.view;

import SAIL_Proyecto.horario;
import SAIL_Proyecto.equipo;

import java.util.LinkedList;

public class beanPrestamoLabPractica {
    
    int codigo;
    int estado;
    String usuario;
    int lab;
    int horario;
    int equipo;
    String fecha;
    String horaInicial;
    String horaFinal;
    String fechasAlquiler;
    
    LinkedList<horario>listaHorarios = new LinkedList<horario>();
    LinkedList<equipo>listaEquipos = new LinkedList<equipo>();
    
    public beanPrestamoLabPractica() {
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setLab(int lab) {
        this.lab = lab;
    }

    public int getLab() {
        return lab;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getHorario() {
        return horario;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setFechasAlquiler(String fechasAlquiler) {
        this.fechasAlquiler = fechasAlquiler;
    }

    public String getFechasAlquiler() {
        return fechasAlquiler;
    }

    public void setListaHorarios(LinkedList<horario> listaHorarios) {
        this.listaHorarios = listaHorarios;
    }

    public LinkedList<horario> getListaHorarios() {
        return listaHorarios;
    }

    public void setListaEquipos(LinkedList<equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public LinkedList<equipo> getListaEquipos() {
        return listaEquipos;
    }
}
