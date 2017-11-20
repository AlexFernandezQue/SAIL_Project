package SAIL_Proyecto;

public class horario {
    
    int codigo;
    String descripcion;
    String horaInicial;
    String horaFinal;
    estado Estado;
    
    public horario(int pCodigo, String pDescripcion, String pHoraIni, String pHoraFin, estado pEstado) {
        super();
        this.setCodigo(pCodigo);
        this.setDescripcion(pDescripcion);
        this.setHoraInicial(pHoraIni);
        this.setHoraFinal(pHoraFin);
        this.setEstado(pEstado);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setEstado(estado Estado) {
        this.Estado = Estado;
    }

    public estado getEstado() {
        return Estado;
    }
}
