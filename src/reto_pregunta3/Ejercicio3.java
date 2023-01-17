package reto_pregunta3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreApellidosAlumno;
        float nota;
        do {
            System.out.print("Ingrese el nombre y apellidos del alumno: ");
            nombreApellidosAlumno = sc.nextLine();
            System.out.print("Ingrese la nota del alumno: ");
            nota = sc.nextFloat();
            sc.nextLine();

            Examen examen = new Examen(nombreApellidosAlumno, nota);
            System.out.println(examen.mostrarDatos());
        } while (nota > 0);
    }
}



