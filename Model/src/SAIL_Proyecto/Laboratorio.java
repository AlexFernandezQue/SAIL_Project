package SAIL_Proyecto;

import java.util.LinkedList;

public class Laboratorio {
    int codigo;
    String descripcion;
    estado estado;
    tipoLaboratorio tipo;
    LinkedList<dispositivo> listaDispositivos= new LinkedList<dispositivo>();
    LinkedList<equipo> listaEquipos= new LinkedList<equipo>();
    
    
    public Laboratorio(int pCodigo, String pDescripcion, estado pEstado, tipoLaboratorio pTipo) {
        super();
        this.setCodigo(pCodigo);
        this.setDescripcion(pDescripcion);
        this.setEstado(pEstado);
        this.setTipo(pTipo);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public void setTipo(tipoLaboratorio tipo) {
        this.tipo = tipo;
    }

    public tipoLaboratorio getTipo() {
        return tipo;
    }

    public void setListaDispositivos(LinkedList<dispositivo> listaDispositivos) {
        this.listaDispositivos = listaDispositivos;
    }

    public LinkedList<dispositivo> getListaDispositivos() {
        return listaDispositivos;
    }

    public void setListaEquipos(LinkedList<equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public LinkedList<equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }

    public estado getEstado() {
        return estado;
    }
}
