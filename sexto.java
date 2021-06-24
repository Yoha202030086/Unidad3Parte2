import java.util.Scanner;

public class sexto {

    public static void main(String[] args) {
        int numeroIntermedio=0;
        int total=0;
        Scanner sca = new Scanner (System.in);
        System.out.println("Digite el numero de personas");
        int numero = sca.nextInt();

      for(int i=0; i<numero; i++){
          System.out.println("Digite la edad de la persona numero "+i+"\n");
          numeroIntermedio=sca.nextInt();
          total=total+numeroIntermedio;
      }
      int media =(int) (total/numero);
      System.out.println("El promedio es "+media);
      
    }

}
