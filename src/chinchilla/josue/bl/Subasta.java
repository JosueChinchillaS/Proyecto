package chinchilla.josue.bl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class Subasta {
    private LocalDate fechaCreacion;
    private LocalDateTime fechaInicioHora;
    private LocalDate fechaVence;
    private double precioMinimo;
    private ArrayList<Item> listaItems;

    public Subasta() {
    }

    public Subasta(LocalDate fechaCreacion, LocalDateTime fechaInicioHora, LocalDate fechaVence, double precioMinimo, ArrayList<Item> listaItems) {
        this.fechaCreacion = fechaCreacion;
        this.fechaInicioHora = fechaInicioHora;
        this.fechaVence = fechaVence;
        this.precioMinimo = precioMinimo;
        this.listaItems = listaItems;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaInicioHora() {
        return fechaInicioHora;
    }

    public void setFechaInicioHora(LocalDateTime fechaInicioHora) {
        this.fechaInicioHora = fechaInicioHora;
    }

    public LocalDate getFechaVence() {
        return fechaVence;
    }

    public void setFechaVence(LocalDate fechaVence) {
        this.fechaVence = fechaVence;
    }

    public double getPrecioMinimo() {
        return precioMinimo;
    }

    public void setPrecioMinimo(double precioMinimo) {
        this.precioMinimo = precioMinimo;
    }

    public ArrayList<Item> getListaItems() {
        return listaItems;
    }

    public void setListaItems(ArrayList<Item> listaItems) {
        this.listaItems = listaItems;
    }

    @Override
    public String toString() {
        return "Subasta{" +
                "fechaCreacion=" + fechaCreacion +
                ", fechaInicioHora=" + fechaInicioHora +
                ", fechaVence=" + fechaVence +
                ", precioMinimo=" + precioMinimo +
                ", listaItems=" + listaItems +
                '}';
    }
}

