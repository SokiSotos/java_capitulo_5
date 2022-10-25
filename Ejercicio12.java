import java.util.Scanner;
public class Ejercicio12{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = sc.nextInt();
        sc.close();
        int i=0;
        int x=1;
        int a=0;
        for(int z=1;z<=n;z++){
              System.out.print(i + " ");
                  a=i+x;
                  i=x;
                  x=a;
        }
    }
}