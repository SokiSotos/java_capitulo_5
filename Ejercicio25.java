import java.util.Scanner;
public class Ejercicio25{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = sc.nextInt();
        int n1 = n;
        int rev = 0;    
        while (n1 > 0) {
          rev = (rev * 10) + (n1 % 10);
          n1 /= 10;
        }
        System.out.print("Si le damos la vuelta al " + n);
        System.out.println(" tenemos el " + rev + ".");
        sc.close();
      }
    }