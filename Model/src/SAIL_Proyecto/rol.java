package SAIL_Proyecto;


import java.util.LinkedList;

public class rol {
    int codigo;
    String descripcion;
    LinkedList<permiso> listaPermisos= new LinkedList<permiso>();
    
    
    public rol(int pCodigo, String pDescripcion) {
        super();
        this.setCodigo(pCodigo);
        this.setDescripcion(pDescripcion);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setListaPermisos(LinkedList<permiso> listaPermisos) {
        this.listaPermisos = listaPermisos;
    }

    public LinkedList<permiso> getListaPermisos() {
        return listaPermisos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
