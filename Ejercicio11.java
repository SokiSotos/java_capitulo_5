import java.util.Scanner;
public class Ejercicio11{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = sc.nextInt();
        int cont=0;
            System.out.println("Numero | Elevado 2 | Elevado 3");      
        while(cont<5){
            cont++;
            int suma=n+cont-1;
            System.out.println(suma + "      |  " + Math.pow(suma, 2) + "      | " + Math.pow(suma, 3));
        }
    sc.close();
    }
}