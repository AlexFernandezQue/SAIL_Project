package SAIL_Proyecto;

public class asignacionEquipo {
    int codigo;
    usuario estudiante;
    asignacionLaboratorio asig_Lab;
    equipo Equipo;
    
    public asignacionEquipo(int pCodigo, usuario pEstudiante,asignacionLaboratorio pAsigLab, equipo pEquipo ) {
        super();
        this.setCodigo(pCodigo);
        this.setEstudiante(pEstudiante);
        this.setAsig_Lab(pAsigLab);
        this.setEquipo(pEquipo);
    }

    public void setEstudiante(usuario estudiante) {
        this.estudiante = estudiante;
    }

    public usuario getEstudiante() {
        return estudiante;
    }

    public void setAsig_Lab(asignacionLaboratorio asig_Lab) {
        this.asig_Lab = asig_Lab;
    }

    public asignacionLaboratorio getAsig_Lab() {
        return asig_Lab;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setEquipo(equipo Equipo) {
        this.Equipo = Equipo;
    }

    public equipo getEquipo() {
        return Equipo;
    }
}
