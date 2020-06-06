import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class EntradaEvento extends Entrada {

    private String evento;

    public EntradaEvento(String autor, String evento) {
        super(autor);
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getCantidadMeGusta() + "\n";
        aDevolver += "Evento: " + evento + "\n";

        long numeroSegundos = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        aDevolver += "Escrito hace ";
        if(numeroSegundos > 59){
            aDevolver += numeroSegundos / 60 + " minutos";
        }
        else {
            aDevolver += numeroSegundos + " segundos";
        }
        aDevolver += "\n";
        aDevolver += "\n";

        return aDevolver;
    }
}
