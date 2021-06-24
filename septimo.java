
import java.util.Random;
import java.util.Scanner;

public class septimo {
    public static void main(String[] Args) {
        Scanner entradaEscaner = new Scanner(System.in);
        int numeroAleatorio = 0;
        int entrada = 0;
        Random rd = new Random();
        numeroAleatorio = rd.nextInt(101);
        System.out.print("Se ha generado un numero aleatorio entre 1 y 36. Intente adivinarlo: ");
        while (numeroAleatorio != (entrada = entradaEscaner.nextInt())) {
            if (entrada < numeroAleatorio)
                System.out.print("No has acertado, el número es mayor. Prueba otra vez: ");
            else
                System.out.print("No has acertado, el número es menor. Prueba otra vez: ");
        }
        System.out.println("LO HAS ADIVINADO");
    }

}
