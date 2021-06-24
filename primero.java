import java.util.Scanner;

public class primero {

    public static void main(String[] args) {
        int numero, iter = 0, aleat;

        Scanner en = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = en.nextInt();

        while (iter < numero) {
            iter++;
            aleat = (int) (Math.random() * 100);
            
            System.out.println((iter) + " Numero aleatorio:  " + aleat);
        }
    }
}
