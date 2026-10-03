package Aportaciones;

import java.util.Scanner;

public class EnsayoClinico {
	
	// Primer paso del ensayo interacción con el usuario para solicitar sus datos

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Indique su nombre a continuación por favor: ");
		String nombre = scanner.nextLine();
		
		System.out.print("Y su apellido si es tan amable: ");
		String apellido = scanner.nextLine();
		
	// Le devuelve al usuario un saludo
		System.out.println("Hola, " + nombre + " " + apellido + " gracias por participar");
		
	// Proceso de selección, solo se aceptará en el estudio a mayores de edad
		System.out.print("Introduzca su edad: ");
		int edad = scanner.nextInt();
		scanner.nextLine();
		
		if (edad >= 18) {
		    System.out.println("Cumple los requisitos. Puede continuar.");
		    System.out.print("Para proceder deberá aceptar los términos y condiciones, escriba SÍ, si está de acuerdo: ");
			String confirmación = scanner.nextLine();
	
	// Si los usuarios son mayores de edad, se comprueba que acepten los términos y condiciones
			if(confirmación.equals("SÍ")) {
				System.out.println("Gracias por participar, " + nombre + " " + apellido + " , el ensayo comenzará en breve.");
			}

	// Alternativa si no es un usuario válido
		} else {
		    System.out.println("No tiene la edad mínima como para participar en este estudio.");
			System.out.println("Lo sentimos, no cumple los criterios para formar parte de este ensayo");
		}

		scanner.close();
	}
}

