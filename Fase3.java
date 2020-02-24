import java.util.Scanner;

//FASE 3 (3 punts)
//Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades). (2 punts)
//Mostreu per consola l’array modificat i ordenat per ordre alfabetic. (1 punt)
//Cambiar las vocales "a" de los nombres de las ciudades por el numero 4 y guarde los nombres modificados en un nuevo array (ArrayCiutatsModificades). (2 puntos)
//Muestre por consola el array modificado y ordenado por orden alfabético. (1 punto)

public class Fase3 {
	public static void main(String[]args) {
		String city1,city2,city3,city4,city5,city6,city7=new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("This code´ll to change letters a for numbers 4...");
		System.out.println("Enter a city");
		city1=sc.next();
		city1=city1.replace('a', '4');
//		System.out.println(city1);
		System.out.println("Enter a city");
		city2=sc.next();
		city2=city2.replace('a', '4');
		System.out.println("Enter a city");
		city3=sc.next();
		city3=city3.replace('a', '4');
		System.out.println("Enter a city");
		city4=sc.next();
		city4=city4.replace('a', '4');
		System.out.println("Enter a city");
		city5=sc.next();
		city5=city5.replace('a', '4');
		System.out.println("Enter a city");
		city6=sc.next();
		city6=city6.replace('a', '4');
		System.out.println("Enter a city");
		city7=sc.next();
		city7=city7.replace('a', '4');
		String cities[]=new String[7];
		cities[0]=city1;
		cities[1]=city2;
		cities[2]=city3;
		cities[3]=city4;
		cities[4]=city5;
		cities[5]=city6;
		cities[6]=city7;
		for(int i=0;i<cities.length;i++){
			System.out.println("Word´s lenght for "+cities[i]+" in the position "+i+" of the array is "+cities[i].length());
			for(int j=0;j<cities[i].length();j++) {
				System.out.println("letter "+j+" place "+i+" of array is: "+cities[i].charAt(j));
//				if(cities[i].charAt(j)=='a') {
//					cities[i].replace("a", "4"); //ver si aplica... es string o es array????
//					System.out.println("con cambio: "+cities[i]);
//				}
			}
		}
	}
}
