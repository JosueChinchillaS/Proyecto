package chinchilla.josue.bl;

public class Categoria {
    private String nombreCategoria;
    private String codigoCategoria;
    private String estadoCategoria;

    public Categoria() {
    }

    public Categoria(String nombreCategoria, String codigoCategoria, String estadoCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.codigoCategoria = codigoCategoria;
        this.estadoCategoria = estadoCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(String codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getEstadoCategoria() {
        return estadoCategoria;
    }

    public void setEstadoCategoria(String estadoCategoria) {
        this.estadoCategoria = estadoCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nombreCategoria='" + nombreCategoria + '\'' +
                ", codigoCategoria='" + codigoCategoria + '\'' +
                ", estadoCategoria='" + estadoCategoria + '\'' +
                '}';
    }
}
