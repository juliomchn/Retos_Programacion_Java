package reto_pregunta4;
import java.util.Scanner;

public class BinaryToDecimal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número binario (máximo 8 dígitos): ");
    String binary = sc.nextLine();

    int decimal = Integer.parseInt(binary, 2);
    System.out.println("El número decimal es: " + decimal);
  }
}
