# Retos_Programacion_Java
- Pregunta 1: 
Crear un programa que me muestre un menú y me pida seleccionar una opción introduciendo un número. El menu tendra 3 opciones: 
    1 - sumar enteros
    2 - contador
    3 - Salir
   El programa mostrará el menú, me solicitará una opción, ejecutará la opción, y volverá a mostrar el menú. Este proceso se repite hasta seleccionar la opción 3. Debo usar una sentencia switch para seleccionar cada opción. Si pulso una opción diferente me lo notificará, pero se repite de nuevo.
   Opción 1: Se solicitará un número entero (pudiendo ser positivo o negativo). Acto seguido mostrará el resultado de la suma de los números desde el n° 0 hasta el número introducido. 
   Opción 2: Muestra un contador con 3 dígitos (formato: X-X-X), que muestre los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una 'E

- Pregunta 2 :
Programa que me solicita al usuario un número entero (fin). Posteriormente me empieza a pedir números enteros y a leerlos, hasta que introduzco el número inicial (fin).
Después de pedir todos los números me debe indicar una serie de estadísticas:
    - Suma de los negativos (0,5)
    - El menor de todos (Tened en cuenta que no tiene por qué ser negativo) (0,5)
    - Media aritmética de los números positivos, mostrada con decimales (0,5)
    - Porcentaje (%) de números negativos respecto al total de enteros introducidos (0,5)


- Pregunta 3: Programa que consta de 2 clases.
La clase Examen tiene dos atributos de instancia: nombreApellidosAlumno de tipo String y nota de tipo float. Tiene un constructor que no recibe parámetros y otro constructor que recibe los dos parámetros para dar valor a sus 2 atributos. Además, tiene métodos setters y getters públicos para permitir el acceso a los atributos privados de la clase. Por último, tiene un método public String mostrar Datos(), el cual devuelve una cadena de texto que con nombre del alumno y su nota con el formato :"Alumno: xxxxxx, Nota: xxxxx".

La segunda clase llamada "Ejercicio3" contiene el método main. Solicitará constantemente al usuario que introduzca una cadena con su nombre y apellidos, y después su nota, creará un objeto dando valor a sus dos atributos, y mostrará por consola el resultado del método mostrarDatos().
Continuará pidiendo datos mientras el valor de la nota introducido sea superior a 0.

- Pregunta 4 
El programa me pide un número binario de 8 cifras como máximo formado únicamente por las cifras 1 y O (No es necesario comprobar estas cuestiones, solo se va a probar con esos criterios). El programa mostrará el n° decimal resultado de la conversión de dicho número binario.
