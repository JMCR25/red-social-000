import java.util.ArrayList;

public class Muro
{
    // Entradas de texto
    private ArrayList <Entrada> entradas;

    public Muro() {
        //Inicializa mensajes y fotos.
        entradas = new ArrayList<>();
    }

    public void addEntrada(Entrada entrada) {
        entradas.add(entrada);
    }


    @Override
    public String toString() {
        String aDevolver = "";

        // Buscamos todas las entradas de texto.
        for (Entrada entrada : entradas) {
            aDevolver += entrada + "\n\n";
        }

        return aDevolver;
    }
}

