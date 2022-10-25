import java.util.Scanner;
public class Ejercicio13{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduzca un numero positivo o negativo");
            n = sc.nextInt();
        if (n > 0)
            cont1++;
        else if (n < 0)
            cont2++;
        else if (n == 0) 
            cont3++;
        }
        System.out.print("has introducido " + cont1 + " numero/s positivo/s, " + cont2 + " numero/s negativo/s y " + cont3 + " ceros.");
    sc.close();
    }
}