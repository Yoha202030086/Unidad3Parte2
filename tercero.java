import java.util.Scanner;

public class tercero {
    public static void main(String[] args) {
        int numero, Factorial=1;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero al que le sacaremos su factorial XD");
        numero=ent.nextInt();
        for(int i=1; i<=numero; i++){
            Factorial=Factorial*i;
        }
        System.out.println("El Factorial del numero es: "+Factorial);
    }
    
}