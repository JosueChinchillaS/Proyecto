package chinchilla.josue.bl;

import java.time.LocalDate;

public class Item {

    private String nombre;
    private String descripcion;
    private Estado estado;
    private String imagen;
    private LocalDate fechaCompra;
    private String antiguedad;
    private Categoria categoria;

    public Item() {
    }

    public Item(String nombre, String descripcion, Estado estado, String imagen, LocalDate fechaCompra, String antiguedad, Categoria categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado =new Estado(nombreEstado, codigoEstado);
        this.imagen = imagen;
        this.fechaCompra = fechaCompra;
        this.antiguedad = antiguedad;
        this.categoria = new Categoria(nombreCategoria, codigoCategoria, estadoCategoria);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setEstado(String nombreEstado, String codigoEstado) {
        estado.setNombreEstado(nombreEstado);
        estado.setCodigoEstado(codigoEstado);
    }

    public void setCategoria(String nombreCategoria, String codigoCategoria) {
        estado.nombreCategoria(nombreCategoria);
        estado.nombreCategoria(nombreCategoria);
    }



    public String toString() {
        return "Item: " +
                "nombre='" + nombre + ", descripcion= " + descripcion + ", estado= " + estado + ", imagen= " + imagen + ", fechaCompra= " + fechaCompra +
                ", antiguedad= " + antiguedad + ", categoria= " + categoria;
    }

}
