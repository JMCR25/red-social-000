public class EntradaFoto extends EntradaConComentario
{
    private String urlImagen;
    private String titulo;


    public EntradaFoto (String autor, String url, String titulo) {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
    }

    public String getUrlImagen() {
        return urlImagen;
    }


    public void addComentario(String textoComentario) {
        getComentarios().add(textoComentario);
    }

    public String getTituloImagen() {
        return titulo;
    }

    public void mostrarDetallesPorPantalla() {
        System.out.println(urlImagen + "\n" + titulo);
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += super.toString();
        aDevolver += "Url: " + urlImagen + "\n";
        aDevolver += "Titulo: " + titulo + "\n";
        aDevolver += "\n";
        return aDevolver;
    }

}