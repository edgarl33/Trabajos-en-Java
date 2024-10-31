package com.problemas;
import java.util.Random;
import java.util.Scanner;

public class Problema1 {

		private static Object function;

		public static void main(String []arg) {
//Crear un programa que arroje un numero ganador al azar. 
		 	
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			
			System.out.println("Ingresa el numero de participantes");
			int numeroDeParticipantes = sc.nextInt();
			int numeroGanador = random.nextInt(numeroDeParticipantes) + 1 ;
			
			System.out.println("El participante numero " + numeroGanador + " es el ganador");

//Desarrollar un programa que solicite al usuario un texto y comprobar si es un palindromo o no. Retornarlo al final.
			
			
			
			
			
			//Scanner sc = new Scanner(System.in);
			sc.nextLine();
			System.out.println("Ingrese la palabra a analizar");
			String userInput = sc.nextLine();
			
			StringBuilder reversedStringObject = new StringBuilder(userInput.toLowerCase().replaceAll("\\s", "")).reverse();
			
			String reversedString = reversedStringObject.toString();
			
			if(reversedString.equals(  userInput.toLowerCase().replaceAll("\\s", ""))){
			 System.out.println("SI es palindromo");
			} else{System.out.println("No es palindromo");
			}
			
			System.out.println(userInput.toLowerCase().replaceAll("\\s", ""));
			System.out.println(reversedString);
			
			
			
			
			//
			int computerNumber = random.nextInt(9) + 1;

			int userChoice  ;
			
			
			do { 
				System.out.println("Adivina el numero que estoy pensando del 1 al 10");
				userChoice = sc.nextInt();
				if (computerNumber == userChoice) {
					System.out.println(" Felicidades, el número " + computerNumber + " es el que estaba pensando");
				}else if(computerNumber > userChoice && userChoice > 0) {
					System.out.println("Tu número " + userChoice + " es más pequeño que el mio, sigue intentando");
				}else if(computerNumber < userChoice && userChoice <10) {
					System.out.println("Tu número " + userChoice + " es más grande que el mio");
				}else System.out.println("El número que ingreaste no es valido, debe ser entre el 1 y el 10");
				
			}while (computerNumber != userChoice);
			
			
			
			
			
		}
	
		
	
}
