import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     // Scanner
     Scanner entrada = new Scanner(System.in);
     int contador = 0;
     char x ;   
      // do while
        do {
            x = entrada.next().charAt(0);
            if(x == 'A'){
                contador++;
            }
        } while (x != '.');
     System.out.println(contador);

     }        
}










