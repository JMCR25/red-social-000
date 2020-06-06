import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Una entrada con imagenes
 *
 * Una entrada es un contenido que el usuario comparte en su muro con la comunidad.
 * Las entradas con imagenes se crean a partir de un autor, un titulo
 * para la imagen y la url de la imagen.
 *
 *  @author DAM
 *  @version 1.0
 */
public class Entrada {
    private String usuario;
    // Fecha de publicacion de la entrada.
    private LocalDateTime momentoPublicacion;
    // Numero de 'me gusta' de la entrada.
    private int cantidadMeGusta;
    // Comentarios de la entrada.
    private ArrayList<String> comentarios;

    public Entrada(String autor) {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<>();
    }
    public String getUsuario(){
        return usuario;
    }

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void meGusta() {
        cantidadMeGusta += 1;
    }
    public void addComentario(String textoComentario) {
        comentarios.add(textoComentario);
    }
    public LocalDateTime getMomentoPublicacion() {
        return momentoPublicacion;
    }
    @Override
    public String toString() {
        return "";
    }
}