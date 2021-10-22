package chinchilla.josue.bl;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Vendedor extends Usuario{

    private ArrayList<Item> listaItems;


    public Vendedor() {
    }

    public Vendedor(String nombreCompleto, String direccion, String correo) {
        super(nombreCompleto, direccion, correo);
        listaItems = new ArrayList<>();
    }

    public ArrayList<Item> getListaItems() {
        return listaItems;
    }

    public void setListaItems(String nombre, String descripcion, Estado estado, String imagen, LocalDate fechaCompra, String antiguedad, Categoria categoria) {

        this.listaItems.add(new Item(nombre, descripcion, estado, imagen, fechaCompra, antiguedad, categoria));
    }

    public String toString() {
        String mensaje =  "Vendedor: " + super.toString();

        for (Item tempItem : listaItems) {
            mensaje += "\n" + tempItem + "\n";
        }
        return mensaje;

    }
}
