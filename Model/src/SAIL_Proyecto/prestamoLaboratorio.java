package SAIL_Proyecto;

public class prestamoLaboratorio {
    int codigo;
    estado estado;
    usuario usuario;
    Laboratorio lab;
    equipo compu;
    String fecha;
    String horaInicial;
    String horaFinal;
    
    public prestamoLaboratorio(int pCodigo, estado pEstado, usuario pUsuario, Laboratorio pLab, equipo pCompu, String pFecha, String pHoraIni, String pHoraFin) {
        super();
        this.setCodigo(pCodigo);
        this.setEstado(pEstado);
        this.setUsuario(pUsuario);
        this.setLab(pLab);
        this.setCompu(pCompu);
        this.setFecha(pFecha);
        this.setHoraInicial(pHoraIni);
        this.setHoraFinal(pHoraFin);
    }


    public void setLab(Laboratorio lab) {
        this.lab = lab;
    }

    public Laboratorio getLab() {
        return lab;
    }

    public void setCompu(equipo compu) {
        this.compu = compu;
    }

    public equipo getCompu() {
        return compu;
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }

    public estado getEstado() {
        return estado;
    }
}
