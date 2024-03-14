package Muniemon;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMuniemon {
	
	public static void main(String[] args) {
		
		//Declaramos la clase Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos el objeto muniemon
		
		Muniemon primerMuniemon = new Muniemon();
		Muniemon segundoMuniemon = new Muniemon();
		
		ArrayList<Muniemon> listaMuniemones = new ArrayList<Muniemon>();
		
		listaMuniemones.add(primerMuniemon);
		listaMuniemones.add(segundoMuniemon);
		
		//CAPA 1: MENU DE INICIO
		
		System.out.println("MUNIEMON");
		System.out.println("El increible mundo de los muniemones");
		System.out.println("____________________________________");
		int numero;
		
		do {
			
			System.out.println("Elija una opción");
			System.out.println("1. Dar de alta los 2 Muniemons para el comabate");
			System.out.println("2. Mostrar Muniemons");
			System.out.println("3. Empezar combate");
			System.out.println("4. Salir del programa");
			numero = sc.nextInt();
			
			switch(numero) {
			
			case 1:
				
				System.out.println("A continuación vamos a dar de alta el primer Muniemon");
				
				primerMuniemon.crearMuniemon();
				
				System.out.println("______________________________________________________");
				System.out.println("A continuacion vamos a dar de alta el segundo Muniemon");
				
				segundoMuniemon.crearMuniemon();
				
				break;
				
			case 2:
				
				System.out.println("A continuación se mostrarán los dos Muniemons");
				System.out.println(primerMuniemon.toString());
				System.out.println("_____________________________________________");
				System.out.println(segundoMuniemon.toString());
				
				break;
			
			case 3:
	
				
				
				break;
				
			case 4:
				
				System.out.println("Usted decidio salir del programa");
				
				break;
			
			default:
			
				System.out.println("Porfavor seleccione una opción correcta");
			
				break;
				
			}
			
			System.out.println("________________________________________________");
			
		}while(numero != 4);
		
	}

}
