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

		System.out.println("Hola, " + nombre + " " + apellido);
		
		System.out.print("Introduzca su edad: ");
		String edad = scanner.nextLine();
		
		System.out.print("Para proceder deberá aceptar los términos y condiciones, escriba SÍ, si está de acuerdo: ");
		String confirmación = scanner.nextLine();
		
		if(confirmación.equals("SÍ")) {
			System.out.println("Gracias por participar, " + nombre + " " + apellido + " , el ensayo comenzará en breve.");
		}

		scanner.close();
	}
}

