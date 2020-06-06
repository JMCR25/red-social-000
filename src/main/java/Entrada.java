import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Entrada {
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;


    public Entrada(String autor) {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }
    public String getUsuario(){
        return usuario;
    }

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    public void meGusta() {
        cantidadMeGusta += 1;
    }
    public void mostrarDetallesPorPantalla() {
    }

    public LocalDateTime getMomentoPublicacion() {
        return momentoPublicacion;
    }
    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getCantidadMeGusta() + "\n";
        long numeroSegundos = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        aDevolver += "Escrito hace 10 segundos";
        aDevolver += "\n";
        return aDevolver;
    }
}