package reto_pregunta1;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (input != 3) {
            System.out.println("\nMenú:");
            System.out.println("1 - Sumar enteros");
            System.out.println("2 - Contador");
            System.out.println("3 - Salir");
            System.out.print("Seleccione una opción: ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    int number = sc.nextInt();

                    int sum = 0;
                    for (int i = 0; i <= number; i++) {
                        sum += i;
                    }
                    System.out.println("La suma de los números desde 0 hasta " + number + " es: " + sum);
                break;

                case 2:
                    for (int i = 0; i <= 9; i++) {
                        for (int j = 0; j <= 9; j++) {
                            for (int k = 0; k <= 9; k++) {
                                String numberCont = String.valueOf(i) + "-" + String.valueOf(j) + "-" + String.valueOf(k);
                                if (numberCont.contains("3")) {
                                    numberCont = numberCont.replace("3", "E");
                                }
                                System.out.println(numberCont);
                            }
                        }
                    }
                break;

                case 3:
                    System.out.println("Saliendo del programa...");
                break;
                default:
                    System.out.println("Opción no válida, por favor seleccione una opción válida del menú.");
            }
        }
    }
}
