import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import javax.swing.JOptionPane;

//L’exercici consisteix en mostrar per consola diferents noms de ciutats partint d’un array i modificar els noms canviant lletres.
//El ejercicio consiste en mostrar por consola diferentes nombres de ciudades partiendo de un array y modificar los nombres cambiando letras.
//Crea sis variables tipu string buides. (0,5 punts)
//Demana per consola que s’introdueixin els noms. (0,5 punts)
//Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat. (0,5 punts)
//Crea seis variables tipu string vacías. (0,5 puntos)
//Pide por consola que se introduzcan los nombres. (0,5 puntos)
//Introduce los siguientes nombres de ciudades (Barcelona, ​​Madrid, Valencia, Málaga, Cádiz, Santander) para teclado. (0,5 puntos)
//Muestra por consola el nombre de las 6 ciudades. (0,5 puntos)
//Mostra per consola el nom de les 6 ciutats. (0,5 punts)
public class Fase1 {
	public static void main(String[]args) {
		String city1,city2,city3,city4,city5,city6 = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a city: ");
		city1 = sc.next();
		System.out.println("Enter a city: ");
		city2 = sc.next();
		System.out.println("Enter a city: ");
		city3 = sc.next();
		System.out.println("Enter a city: ");
		city4 = sc.next();
		System.out.println("Enter a city: ");
		city5 = sc.next();
		System.out.println("Enter a city: ");
		city6 = sc.next();
		System.out.print("You entered this cities: ");
		String cities[]=new String[6];
		cities[0]=city1;
		cities[1]=city2;
		cities[2]=city3;
		cities[3]=city4;
		cities[4]=city5;
		cities[5]=city6;
		for(int j=0;j<6;j++) {
			System.out.print(cities[j]+" ");
		}
	}
}
