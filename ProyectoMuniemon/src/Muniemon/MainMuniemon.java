package Muniemon;

import java.util.Scanner;

public class MainMuniemon {
	
	public static void main(String[] args) {
		
		//Declaramos la clase Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos el objeto muniemon
		
		Muniemon primerMuniemon = new Muniemon();
		Muniemon segundoMuniemon = new Muniemon();
		
		//CAPA 1: MENU DE INICIO
		
		System.out.println("MUNIEMON");
		System.out.println("El increible mundo de los muniemones");
		System.out.println("____________________________________");
		int numero;
		
		do {
			
			System.out.println("Elija una opción");
			System.out.println("1. Dar de alta primer Muniemon");
			System.out.println("2. Dar de alta segundo Muniemon");
			System.out.println("3. Mostrar primer Muniemon");
			System.out.println("4. Mostrar segundo Muniemon");
			System.out.println("5. Ataca el primer Muniemon al segundo Muniemon");
			System.out.println("6. Ataca el segundo Muniemon al primer Muniemon");
			System.out.println("7. Salir del programa");
			numero = sc.nextInt();
			
			switch(numero) {
			
			case 1:
				
				System.out.println("A continuación vamos a dar de alta el primer Muniemon");
				
				primerMuniemon.crearMuniemon();
				
				break;
				
			case 2:
				
				System.out.println("A continuación vamos a dar de alta el segundo Muniemon");
				
				segundoMuniemon.crearMuniemon();
				
				break;
			
			case 3:
	
				System.out.println("A continuación se mostrará el primer Muniemon");
				System.out.println(primerMuniemon.toString());
				
				break;
				
			case 4:
				
				System.out.println("A continuación se mostrará el segundo Muniemon");
				System.out.println(segundoMuniemon.toString());
				
				break;
				
			case 5:
				
				System.out.println("Primer Muniemon ataca a segundo Muniemon");
				
				if (primerMuniemon != null && segundoMuniemon != null) {
					
                    primerMuniemon.atacarMuniemon(segundoMuniemon);
                    
                } else {
                	
                    System.out.println("Debe crear ambos Muniemon primero.");
                    
                }
				
                break;
			
			case 6:
				
				System.out.println("Segundo Muniemon ataca a primer Muniemon");
				
				if (primerMuniemon != null && segundoMuniemon != null) {
					
                    segundoMuniemon.atacarMuniemon(primerMuniemon);
                    
                } else {
                	
                    System.out.println("Debe crear ambos Muniemon primero.");
                    
                }
				
                break;
				
			case 7:
				
				System.out.println("Usted decidio salir del programa");
				
				break;
			
			default:
			
				System.out.println("Porfavor seleccione una opción correcta");
			
				break;
				
			}
			
			System.out.println("________________________________________________");
			
		}while(numero != 7);
		
	}

}
