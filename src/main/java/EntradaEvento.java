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
        aDevolver += super.toString();
        aDevolver += "Evento: " + evento + "\n";
        aDevolver += "\n";

        return aDevolver;
    }
}
