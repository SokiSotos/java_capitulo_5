import java.util.Scanner;
public class Ejercicio8{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    sc.close();
    }
}