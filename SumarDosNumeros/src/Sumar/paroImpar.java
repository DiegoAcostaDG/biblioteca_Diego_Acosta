package Sumar;

import java.util.Scanner;

public class paroImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Introduce un número: ");
		        int numero = scanner.nextInt();

		        if (numero % 2 == 0) {
		            System.out.println("El número " + numero + " es par.");
		        } else {
		            System.out.println("El número " + numero + " es impar.");
		        }
		        scanner.close();
		    }
	}
