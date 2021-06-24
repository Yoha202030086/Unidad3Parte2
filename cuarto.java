import java.util.Scanner;

public class cuarto {
    public static void main(String[] args) {
        
        Scanner teclea = new Scanner(System.in);
        
        System.out.println("Introducir edad");
        int edad = teclea.nextInt();
      
        if(edad >=1 && edad <=100){
        
            if(edad <  18){
            System.out.println(" "+edad+" años es menor de edad");
            }

            else if(edad > 18){
                System.out.println(" "+edad+" años es mayor de edad");
            }

        }

    }
}

                                                               