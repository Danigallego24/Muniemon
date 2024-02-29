package Muniemon;

import java.util.Scanner;

public class Muniemon {
	
	Scanner sc = new Scanner(System.in);
	
	//Atributos de Muniemones
	
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private TypeMuniemon tipo;
	
	//Getters y Setters
	
	public String getNombre() {
		
		return nombre;
	
	}
	
	public void setNombre(String nombre) {
	
		this.nombre = nombre;
	
	}
	
	public int getVida() {
	
		return vida;
	
	}
	
	public void setVida(int vida) {
	
		this.vida = vida;
	
	}
	
	public int getAtaque() {
	
		return ataque;
	
	}
	
	public void setAtaque(int ataque) {
	
		this.ataque = ataque;
	
	}
	
	public int getDefensa() {
	
		return defensa;
	
	}
	
	public void setDefensa(int defensa) {
	
		this.defensa = defensa;
	
	}
	
	public TypeMuniemon getTipo() {
	
		return tipo;
	
	}
	
	public void setTipo(TypeMuniemon tipo) {
	
		this.tipo = tipo;
	
	}

	public String toString() {
		
		return "Muniemon [ nombre = " + nombre + ", vida = " + vida + ", ataque = " + ataque + ", defensa = " + defensa
				+ ", tipo = " + tipo + " ]";
		
	}
	
	public void crearMuniemon() {
		
		System.out.println("Nombre: ");
		
		setNombre(sc.nextLine());
		
		System.out.println("Vida: ");
		
		setVida(sc.nextInt());
		
		System.out.println("Ataque: ");
		
		setAtaque(sc.nextInt());
		
		System.out.println("Defensa: ");
		
		setDefensa(sc.nextInt());
		
		System.out.println("Elija un tipo: ");
		
		int posicion = 0;
		
		for(TypeMuniemon tm : TypeMuniemon.values()) {
			
			System.out.println(posicion++ + "-" + tm);
			
		}
		
		int seleccion = sc.nextInt();
		
		TypeMuniemon tv = TypeMuniemon.values()[seleccion];
		
		System.out.println("Usted a seleccionado: " + tv);
		
	}
	
}
