package chinchilla.josue.bl;

public class Usuario {

    private String nombreCompleto;
    private String direccion;
    private String correo;

    public Usuario() {
    }

    public Usuario(String nombre, String direccion, String correo) {
        this.nombreCompleto = nombre;
        this.direccion = direccion;
        this.correo = correo;
    }


    public String getNombre() {
        return nombreCompleto;
    }

    public void setNombre(String nombre) {
        this.nombreCompleto = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombreCompleto + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
