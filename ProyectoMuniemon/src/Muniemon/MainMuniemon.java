package Muniemon;

import java.util.Scanner;

public class MainMuniemon {
	
	public static void main(String[] args) {
		
		//Declaramos la clase Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos el objeto muniemon
		
		Muniemon muniemon = new Muniemon();
		
		//CAPA 1: MENU DE INICIO
		
		System.out.println("MUNIEMON");
		System.out.println("El increible mundo de los muniemones");
		System.out.println("____________________________________");
		int numero;
		
		do {
			
			System.out.println("Elija una opción");
			System.out.println("1. Dar de alta un Muniemon");
			System.out.println("2. Mostrar Muniemon");
			System.out.println("3. Salir del programa");
			numero = sc.nextInt();
			
			switch(numero) {
			
			case 1:
				
				System.out.println("A continuación vamos a dar de alta un Muniemon");
				
				muniemon.crearMuniemon();
				
				break;
			
			case 2:
				
				System.out.println("A continuación se mostrará el Muniemon");
				System.out.println(muniemon.toString());
				
			case 3:
				
				System.out.println("Usted decidio salir del programa");
				
				break;
			
			default:
			
				System.out.println("Porfavor seleccione una opción correcta");
			
				break;
				
			}
			
			System.out.println("________________________________________________");
			
		}while(numero != 3);
		
	}

}
