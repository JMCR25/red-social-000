public class EntradaTexto extends EntradaConComentario
{
    private String mensaje;

    public EntradaTexto (String autor, String texto) {
        super(autor);
        mensaje = texto;
    }

    public String getMensaje() {
        return mensaje;
    }


    public void addComentario(String textoComentario) {
        getComentarios().add(textoComentario);
}

    public void mostrarDetallesPorPantalla() {
        System.out.println(mensaje);
    }
    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += super.toString();
        aDevolver += mensaje + "\n";
        aDevolver += "\n";
        return aDevolver;
    }
    public void mostrarAutorYMensaje() {
        System.out.println("Autor: " + getUsuario() + "\n" + "Mensaje: " + mensaje);
    }
}