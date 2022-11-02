import java.util.Scanner;
public class Ejercicio24{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = sc.nextInt();
        sc.close();
        int al = 1;
        int i = 0;
        int es = n - 1;
        while (al <= n) {
          for (i = 1; i <= es; i++) {
            System.out.print(" ");
          }
          for (i = 1; i < al; i++) {
            System.out.print(i);
          }
          for (i = al; i > 0; i--) {
            System.out.print(i);
          }
          System.out.println();
          al++;
          es--;
        }
        sc.close();
      }
    }