package SAIL_Proyecto;

public class cuatrimestre {
    int codigo;
    String descripcion;
    
    public cuatrimestre(int pCodigo, String pDescripcion) {
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
