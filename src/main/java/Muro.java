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
    public String[] getUrlsFotos() {
        String contenedor = "";
        int tamano = entradas.size();
        String[] url = new String[tamano];
        int cont = 0;
        for (Entrada entrada : entradas) {
            if(entrada instanceof EntradaFoto) {
                cont++;
                EntradaFoto foto = (EntradaFoto)entrada;
                url[cont] = foto.getUrlImagen() + "\n";
                contenedor += foto.getUrlImagen() + "\n";
            }
        }
        System.out.println(contenedor);
        return url;
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

