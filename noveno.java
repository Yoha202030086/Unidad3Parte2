import java.util.Scanner;

public class noveno {
    
    public static void main(String[] args) {
        float acum = 1; //acumulado
        float temperaturas = 0;
        Scanner r = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de temperaturas a promediar");
        float cn = r.nextFloat(); //Cantidad de temperaturas

        while(acum <= cn){
System.out.println("ingresa la temperatura: " +acum);
float t = r.nextFloat();
temperaturas += t;
acum++;
        }
        float promedio = temperaturas/cn;
        System.out.println("El promedio es: "+promedio);
    }
}
