package com.problemas;
import java.util.Scanner;


public class Problema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();
		System.out.println("Digite su ingreso mensual ");
		float ingresoMensual = sc.nextFloat();
		
		do {
			//System.out.println("Ingrese su edad");
			//int edad = sc.nextInt();
			
				if (edad <= 29 && edad > 0 ){
					double resultado = ingresoMensual > 300 ? 100  *1.1: 100 * 1.05;
					System.out.println("tu prima mensual es " + resultado);
					break;
					
				}else if (edad >= 30 && edad <= 49) {
					double resultado = ingresoMensual > 300 ? 250  *1.1: 250 * 1.05;
					System.out.println("Tu prima mensual es " + resultado);
					break;
					
				}else if (edad >= 50 && edad <= 69) {
					double resultado = ingresoMensual > 300 ? 400  *1.1: 400 * 1.05;
					System.out.println("Tu prima mensual es " + resultado);
					break;
					
				}else if (edad >= 70 && edad <= 110) {
					double resultado = ingresoMensual > 300 ? 500  *1.1: 500* 1.05;
					System.out.println("Tu prima mensual es " + resultado);
					break;
				}else {
					System.out.println("Ingrese otra edad de 0 a 110" );
					edad = sc.nextInt();
				} 
		
		}while (edad <= 110 && edad > 0);
		
		
		//System.out.println("Introduza su nombre de usuario");
		//String userName = sc.next();
		//System.out.println("Introduzca su contraseña");
		//String userPassword = sc.next();
		
		
		
		
		
		
		
	}

}
