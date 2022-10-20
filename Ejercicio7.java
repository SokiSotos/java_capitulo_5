import java.util.Scanner;
public class Ejercicio7{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 4;
        int num;
        boolean acertado = false;
        do {
          System.out.print("Introduzca la clave de la caja fuerte: ");
          num = sc.nextInt();
          
          if (num == 8888) {
            acertado = true;
          } 
          else {
            System.out.println("Clave incorrecta");
          }
          
          intentos--;
      
        } while((intentos > 0) && (!acertado));
        
        if (acertado) {
          System.out.println("Ha abierto la caja fuerte.");
        } 
        else {
          System.out.println("Lo siento, ha agotado las 4 oportunidades.");
        }
    sc.close();
    }
}