import java.util.Scanner;
public class Ejercicio9{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        long n = sc.nextLong();
        sc.close();
        long n1 = n;
        long cont=1;
        for(n=n1;n>=10;cont++){
            n /=10;
        }
            System.out.printf("%d tiene%2d digitos",n1,cont);
    }
}