//FASE 2 (2 puntos)
//Una vez tenemos los nombres de las ciudades guardados en variables tendremos que pasar la información a un array (arrayCiutats). (1 punto)
//Cuando tengamos el array lleno, tendremos que mostrar por consola el nombre de las ciudades ordenadas por orden alfabético. (1 punto)

import java.util.Scanner;

public class Fase2 {
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
		System.out.println(city1+", "+city2+", "+city3+", "+city4+", "+city5+", "+city6+".");
		String cities[]=new String[6];
		cities[0]=city1;
		cities[1]=city2;
		cities[2]=city3;
		cities[3]=city4;
		cities[4]=city5;
		cities[5]=city6;
		for(int m=0;m<cities.length-1;m++) {
			for(int n=m+1;n<cities.length;n++) {
				if(cities[m].compareToIgnoreCase(cities[n])>0) {
					String aux = cities[m];
					cities[m]=cities[n];
					cities[n]=aux;
				}
			}
		}
		System.out.println("The ordered list of cities is:");
		for(int j=0;j<6;j++) {
			System.out.print(cities[j]+" ");
		}
	}
}
