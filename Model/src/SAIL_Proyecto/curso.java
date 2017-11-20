package SAIL_Proyecto;

public class curso {
    //año y cuatrimestre no pertenece a curso, sino a asignacion
    int codigo;
    String descripcion;
    estado estado;
    
    
    public curso( int pCodigo, String pDescripcion, estado pEstado) {
        super();
        this.setCodigo(pCodigo);
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

    public void setEstado(estado estado) {
        this.estado = estado;
    }

    public estado getEstado() {
        return estado;
    }
}
