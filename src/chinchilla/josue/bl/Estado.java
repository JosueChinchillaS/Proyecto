package chinchilla.josue.bl;

public class Estado {
    private String nombreCategoria;
    private String codigoCategoria;


    public Estado() {
    }

    public Estado(String nombreCategoria, String codigoEstado) {
        this.nombreCategoria = nombreCategoria;
        this.codigoCategoria = codigoCategoria;
    }

    public String getNomnbreEstado() {
        return nombreCategoria;
    }

    public void setNomnbreEstado(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getCodigoEstado() {
        return codigoCategoria;
    }

    public void setCodigoEstado(String codigoEstado) {
        this.codigoCategoria = codigoCategoria;
    }
}
