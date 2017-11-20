package SAIL_Proyecto;

public class asignacionLaboratorio {
    int codigo;
    horario horario;
    usuario profesor;
    curso curso;
    Laboratorio lab;
    cuatrimestre cuatri;
    String annio;
    
    public asignacionLaboratorio(int pCodigo, horario pHorario, usuario pProfesor, curso pCurso, Laboratorio pLab, cuatrimestre pCuatri, String pAnnio ) {
        super();
        this.setCodigo(pCodigo);
        this.setHorario(pHorario);
        this.setProfesor(pProfesor);
        this.setCurso(pCurso);
        this.setLab(pLab);
        this.setCuatri(pCuatri);
        this.setAnnio(pAnnio);
    }
    public void setLab(Laboratorio lab) {
        this.lab = lab;
    }

    public Laboratorio getLab() {
        return lab;
    }

    public void setAnnio(String annio) {
        this.annio = annio;
    }

    public String getAnnio() {
        return annio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setHorario(horario horario) {
        this.horario = horario;
    }

    public horario getHorario() {
        return horario;
    }

    public void setCurso(curso curso) {
        this.curso = curso;
    }

    public curso getCurso() {
        return curso;
    }

    public void setCuatri(cuatrimestre cuatri) {
        this.cuatri = cuatri;
    }

    public cuatrimestre getCuatri() {
        return cuatri;
    }

    public void setProfesor(usuario profesor) {
        this.profesor = profesor;
    }

    public usuario getProfesor() {
        return profesor;
    }
}
