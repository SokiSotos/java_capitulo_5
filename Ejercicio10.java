import java.util.Scanner;
public class Ejercicio10{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double n = 0;
        double cont = 0;
        double suma = 0;
        do{
            System.out.println("Introduzca un numero");
            n = sc.nextDouble();
            cont++;
            suma = suma + n;
        }while(n >= 0);
            System.out.print("La media de los números positivos introducidos es ");
            System.out.println((suma - n) / (cont - 1));
    sc.close();
    }
}