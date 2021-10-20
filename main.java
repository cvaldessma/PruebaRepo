package examen;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Leer 5 valores desde teclado y calcular la suma de éstos
		// el valor medio, el mayor y el menor. Imprime de forma descriptiva 
		// y adecuada los resultados obtenidos
		Scanner sc = new Scanner(System.in);
		int NUM_INPUTS = 5;
		int[] array = new int[5];
		int suma = 0;
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		for(int i = 0; i<NUM_INPUTS; i++) {
			System.out.println("Introduce un valor");
			int valor = sc.nextInt();
			suma += valor;
			mayor = valor>mayor ? valor:mayor;
			menor = valor<menor ? valor:menor;			
		}
		while(mayor == 0){
			System.out.println("HOLA")
		}
		int otro = 7;
		int cesar = 3;
		int media = suma / NUM_INPUTS;
		System.out.println("La suma de todos los valores es: " + suma);
		System.out.println("El mayor de todos los valores es: " + mayor);
		System.out.println("El menor de todos los valores es: " + menor);
		System.out.println("La media de todos los valores es: " + media);
	}
}
