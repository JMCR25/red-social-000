import org.junit.Test;
import static org.junit.Assert.*;


public class MuroTest {
    @Test
    public void test01() {

        Muro muro = new Muro();

        EntradaTexto entrada01 = new EntradaTexto("Nacho", "Recien llegado de mis vacaciones en Hawai!");
        EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaTexto entrada03 = new EntradaTexto("Begona", "Esta lloviendo ahi fuera...");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");
        EntradaEvento entrada05 = new EntradaEvento("Chema", "Ha iniciado sesion");

        muro.addEntrada(entrada01);
        muro.addEntrada(entrada02);
        muro.addEntrada(entrada03);
        muro.addEntrada(entrada04);
        muro.addEntrada(entrada05);
        assertEquals(muro.toString(), "Usuario: Nacho\n" +
                "Likes: 0\n" +
                "Escrito hace 10 segundos\n" +
                "No hay comentarios\n" +
                "Recien llegado de mis vacaciones en Hawai!\n" +
                "\n" +
                "\n" +
                "\n" +
                "Usuario: Luis\n" +
                "Likes: 0\n" +
                "Escrito hace 10 segundos\n" +
                "No hay comentarios\n" +
                "Url: https://bit.ly/2W1dO09\n" +
                "Titulo: Gracias\n" +
                "\n" +
                "\n" +
                "\n" +
                "Usuario: Begona\n" +
                "Likes: 0\n" +
                "Escrito hace 10 segundos\n" +
                "No hay comentarios\n" +
                "Esta lloviendo ahi fuera...\n" +
                "\n" +
                "\n" +
                "\n" +
                "Usuario: Cristina\n" +
                "Likes: 0\n" +
                "Escrito hace 10 segundos\n" +
                "No hay comentarios\n" +
                "Url: https://bit.ly/3cY9vtD\n" +
                "Titulo: Una foto de mi nevera\n" +
                "\n" +
                "\n" +
                "\n" +
                "Usuario: Chema\n" +
                "Likes: 0\n" +
                "Escrito hace 10 segundos\n" +
                "Evento: Ha iniciado sesion\n" +
                "\n" +
                "\n" +
                "\n" );
        muro.getUrlsFotos();
    }

}
