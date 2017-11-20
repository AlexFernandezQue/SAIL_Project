package SAIL_Proyecto;

public class tipoLaboratorio {
    int codigo;
    String descripcion;
    int cantidadEstudiantes;
    
    public tipoLaboratorio(int pCodigo, String pDescripcion, int pCantidadEstudiantes) {
        super();
        this.setCodigo(pCodigo);
        this.setDescripcion(pDescripcion);
        this.setCantidadEstudiantes(pCantidadEstudiantes);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
