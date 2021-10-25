package chinchilla.josue.bl;

import java.time.LocalDate;

public class Administrador extends Usuario {
    private String avatar;
    private int identificacion;
    private LocalDate fechaNacimiento;
    private String Estado;
    private String correo;
    private String contrasennia;

    public Administrador() {
    }

    public Administrador(String nombre, String direccion, String correo, String avatar, int identificacion, LocalDate fechaNacimiento, String estado, String correo1, String contrasennia) {
        super(nombre, direccion, correo);
        this.avatar = avatar;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        Estado = estado;
        this.correo = correo1;
        this.contrasennia = contrasennia;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    @Override
    public String getCorreo() {
        return correo;
    }

    @Override
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasennia() {
        return contrasennia;
    }

    public void setContrasennia(String contrasennia) {
        this.contrasennia = contrasennia;
}}
