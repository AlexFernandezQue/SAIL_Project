package SAIL_Proyecto;

public class estado {
    int codigo;
    String descripcion;
    public estado( int pCodigo, String pDescripcion ) {
        super();
        this.setCodigo(pCodigo);
        this.setDescripcion(pDescripcion);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
