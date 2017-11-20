package SAIL_Proyecto;

public class mantenimientoEquipo {
    int codigo;
    String Descripcion;
    equipo compu;
    tipoServicio tipo;
    int usuario;
    int codigoCompu;
    String fechaInicio;
    String fechaFinal;
    
    public mantenimientoEquipo( int pCodigo, String pDescripcion, equipo pCompu, tipoServicio pTipo, int pUsuario) {
        super();
        this.setCodigo(pCodigo);
        this.setDescripcion(pDescripcion);
        this.setCompu(pCompu);
        this.setTipo(pTipo);
        this.setUsuario(pUsuario);
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setCompu(equipo compu) {
        this.compu = compu;
    }

    public equipo getCompu() {
        return compu;
    }

    public void setTipo(tipoServicio tipo) {
        this.tipo = tipo;
    }

    public tipoServicio getTipo() {
        return tipo;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setCodigoCompu(int codigoCompu) {
        this.codigoCompu = codigoCompu;
    }

    public int getCodigoCompu() {
        return codigoCompu;
    }
}
