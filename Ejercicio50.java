import java.util.Scanner;

public class Ejercicio50 {
  
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura (5 como mínimo): ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
    int espacios = Integer.parseInt(s.nextLine());


    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("****");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("****");


    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("*   ");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("*");


    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("****");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("****");

    for (int fila = 0; fila < altura - 4; fila++) {
      System.out.print("*");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.print("   *");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.println("   *");
    }


    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("****");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("****");
    s.close();
  }
}