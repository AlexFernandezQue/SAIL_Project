package SAIL_Proyecto;

import java.util.LinkedList;

public class equipo {
    //Eliminar tipo de servicio de base de datos
    int codigo;
    int numeroCompu;
    String descripcion;
    estado estado;
    LinkedList<dispositivo> listaDispositivos= new LinkedList<dispositivo>();
    
    public equipo( int pCodigo, int pNumCompu, String pDescripcion, estado pEstado) {
        super();
        this.setCodigo(pCodigo);
        this.setNumeroCompu(pNumCompu);
        this.setDescripcion(pDescripcion);
        this.setEstado(pEstado);
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNumeroCompu(int numeroCompu) {
        this.numeroCompu = numeroCompu;
    }

    public int getNumeroCompu() {
        return numeroCompu;
    }

    public void setListaDispositivos(LinkedList<dispositivo> listaDispositivos) {
        this.listaDispositivos = listaDispositivos;
    }

    public LinkedList<dispositivo> getListaDispositivos() {
        return listaDispositivos;
    }


    public void setEstado(estado estado) {
        this.estado = estado;
    }

    public estado getEstado() {
        return estado;
    }
}
