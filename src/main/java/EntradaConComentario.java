import java.util.ArrayList;
public class EntradaConComentario extends Entrada {
    private ArrayList<String> comentarios;

    public EntradaConComentario(String autor) {
        super(autor);
        comentarios = new ArrayList<>();
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void addComentario(String text) {
        comentarios.add(text);
    }

    @Override
    public String toString() {
        String aDevolver = "";
        aDevolver += super.toString();
        if (comentarios.size() == 0) {
            aDevolver += "No hay comentarios" + "\n";
        } else {
            aDevolver += "Comentarios: \n";
            for (String comentarioActual : comentarios) {
                aDevolver += comentarioActual + "\n";
            }

        }
        return aDevolver;
    }
}
