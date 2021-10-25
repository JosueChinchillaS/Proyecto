package chinchilla.josue.bl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class Collecionista extends Usuario {

    private String avatar;
    private int identificacion;
    private LocalDate fechaNacimiento;
    private int edad;
    private Estado estado;
    private int puntuacion;
    private String contrasennia;
    private String[] listaIntereses;
    private ArrayList<Item> listaItems;

    public Collecionista() {
    }


    public Collecionista(String nombre, String direccion, String correo, String avatar, int identificacion, LocalDate fechaNacimiento, int edad, int puntuacion, String contrasennia) {
        super(nombre, direccion, correo);
        this.avatar = avatar;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.estado = new Estado(nombreEstado, codigoEstado);
        this.puntuacion = puntuacion;
        this.contrasennia = contrasennia;
        this.listaIntereses = new String[10];
        this.listaItems = new ArrayList<>();
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

    public int getEdad() {
        return edad;
    }


    public void setEstado(String nombreEstado, String codigoEstado) {
        estado.setNomnbreEstado(nombreEstado);
        estado.setCodigoEstado(codigoEstado);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getContrasennia() {
        return contrasennia;
    }

    public void setContrasennia(String contrasennia) {
        this.contrasennia = contrasennia;
    }


    public void setIntereses(String interes) {
        int contador = 0;
        for (int i = 0; i < listaIntereses.length; i++){
            listaIntereses[contador] = interes;
            contador++;
        }

    }


    public void setListaItems(String nombre, String descripcion, Estado estado, String imagen, LocalDate fechaCompra, String antiguedad, Categoria categoria) {

        this.listaItems.add(new Item(nombre, descripcion, estado, imagen, fechaCompra, antiguedad, categoria));
    }


    @Override
    public String toString() {
        String mensaje = "Coleccionista: " + "avatar= " + avatar + ", identificacion= " + identificacion + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad +", estado=" + estado +
                ", puntuacion=" + puntuacion + ", contrasenia='" + contrasennia + ", listaIntereses=" + Arrays.toString(listaIntereses) + ", listaItems=" + listaItems;
        mensaje += "\n ------------ Lista de intereses ------------\n";
        for (int i = 0; i < listaIntereses.length; i++) {
            mensaje += "\n" + listaIntereses[i] + "\n";
        }
        mensaje += "\n ------------ Lista de intereses ------------\n";
        for (Item tempItem : listaItems) {
            mensaje += "\n" + tempItem + "\n";
        }
        return mensaje;
    }

}
