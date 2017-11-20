package SAIL_Proyecto.view;

import SAIL_Proyecto.Laboratorio;
import SAIL_Proyecto.asignacionEquipo;
import SAIL_Proyecto.equipo;
import SAIL_Proyecto.estado;
import SAIL_Proyecto.horario;

import java.util.LinkedList;

public class beanPrestamoLab {
    int codigo;
    int estado;
    String usuario;
    int lab;
    int horario;
    String fecha;
    String horaInicial;
    String horaFinal;
    
    LinkedList<horario>listaHorarios = new LinkedList<horario>();
    
    public beanPrestamoLab() {
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

    public void setListaHorarios(LinkedList<horario> listaHorarios) {
        this.listaHorarios = listaHorarios;
    }

    public LinkedList<horario> getListaHorarios() {
        return listaHorarios;
    }
}
