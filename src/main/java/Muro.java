import java.util.ArrayList;

public class Muro
{
    private ArrayList <Entrada> entradas;

    public Muro() {
        entradas = new ArrayList<>();
    }

    public void addEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    public void mostrarDetallesTodasLasEntradas() {
        for (Entrada entrada : entradas) {
            entrada.mostrarDetallesPorPantalla();
        }
    }
    @Override
    public String toString() {
        String aDevolver = "";

        for (Entrada entrada : entradas) {
            aDevolver += entrada + "\n" + "\n";
        }

        return aDevolver;
    }
}

