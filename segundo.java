
    import java.util.Scanner;

public class segundo {
    public static void main(String[] args) {
        int numero,contador=0;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero=ent.nextInt();
        while(numero>0){
            numero--;
            contador++;

        }
        System.out.println("La cantidad de numeros entre el ingresado y el 1 es: "+contador);
    }
    
}

