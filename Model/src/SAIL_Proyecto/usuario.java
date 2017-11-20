package SAIL_Proyecto;

public class usuario {
    String codigo;
    String nombre;
    String correo;
    String contrasena;
    rol rol;
    preguntaClave pregunta;
    String respuesta;
    estado estado;
    
    public usuario(String pCodigo, String pNombre, String pCorreo, String pContra, rol pRol, estado pEstado) {
        super();
        this.setCodigo(pCodigo);
        this.setNombre(pNombre);
        this.setCorreo(pCorreo);
        this.setContrasena(pContra);
        this.setRol(pRol);
        this.setEstado(pEstado);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setPregunta(preguntaClave pregunta) {
        this.pregunta = pregunta;
    }

    public preguntaClave getPregunta() {
        return pregunta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRol(rol rol) {
        this.rol = rol;
    }

    public rol getRol() {
        return rol;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }

    public estado getEstado() {
        return estado;
    }
}
