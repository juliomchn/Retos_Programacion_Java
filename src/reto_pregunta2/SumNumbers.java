package reto_pregunta2;

import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int initialNumber = sc.nextInt();
		double number;
		double negativeSum = 0, countNegative = 0, countPositive = 0;
		double positiveSum = 0;
		double minNumber = Double.MAX_VALUE; //Inicializamos el menor numero en el maximo valor posible para int
	
		System.out.print("Ingrese números (ingrese " + initialNumber + " para finalizar): ");
		while ((number = sc.nextDouble()) != initialNumber) {
		  if (number < minNumber) {
			minNumber = number;
		  }
		  if (number < 0) {
			negativeSum += number;
			countNegative++;
		  }else if(number>0){
			positiveSum += number;
			countPositive++;
		  }
		}
	
		System.out.println("La suma de los números negativos es: " + negativeSum);
		System.out.println("El menor número introducido es: " + minNumber);
		if(countPositive > 0){
			double average = positiveSum / countPositive;
			System.out.println("La media aritmetica de los números positivos con decimales es: " + average);
		}else{
			System.out.println("No se ingresaron numeros positivos");
		}
		if(countNegative > 0){
			double percentageNegative = (countNegative * 100.0) / (countNegative + countPositive);
			System.out.println("El porcentaje de números negativos introducidos es: " + percentageNegative + "%");
		}else{
			System.out.println("No se ingresaron numeros negativos");
		}
	  }

}
