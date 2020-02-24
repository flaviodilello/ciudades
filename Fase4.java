import java.util.Scanner;

//Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length). (0,5 punts)
//Ompliu els nous arrays lletra per lletra.(2 punts)
//Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). (0,5 punts)

// Cree un nuevo array para cada una de las ciudades que tenemos. El tamaño de los nuevos arrays será la longitud de cada string (string nomCiutat.Length). (0,5 puntos)
// Llene los nuevos arrays letra por letra. (2 puntos)
// Muestra por consola los nuevos arrays con los nombres invertidos (Ej: Barcelona - anolecraB). (0,5 puntos)

public class Fase4 {
	public static void main(String[]args) {
		int value; //aqui se guardara el lenght de cada nombre de ciudad ingresado
		Scanner sc = new Scanner(System.in);
		//-------------------------------------------------
		System.out.println("Enter the first city: ");
		String city1 = sc.next();
		value = city1.length();
		Character arrayCity1[] = new Character[value];
//		for(int i=0;i<arrayCity1.length;i++) {
//			arrayCity1[i]=city1.charAt(i);
//			System.out.println(arrayCity1[i]);
//		}
		for(int i=(value-1);i>=0;i--) {
			arrayCity1[i]=city1.charAt(i);
			System.out.println(arrayCity1[i]);
		}
		//-------------------------------------------------
		System.out.println("Enter the second city: ");
		String city2 = sc.next();
		value = city2.length();
		Character arrayCity2[] = new Character[value];
		for(int i=(value-1);i>=0;i--) {
			arrayCity2[i]=city2.charAt(i);
			System.out.println(arrayCity2[i]);
		}
		//-------------------------------------------------
		System.out.println("Enter the thirdth city: ");
		String city3 = sc.next();
		value = city3.length();
		Character arrayCity3[] = new Character[value];
		for(int i=(value-1);i>=0;i--) {
			arrayCity3[i]=city3.charAt(i);
			System.out.println(arrayCity3[i]);
		}
		//-------------------------------------------------
		System.out.println("Enter the fourth city: ");
		String city4 = sc.next();
		value = city4.length();
		Character arrayCity4[] = new Character[value];
		for(int i=(value-1);i>=0;i--) {
			arrayCity4[i]=city4.charAt(i);
			System.out.println(arrayCity4[i]);
		}
		//-------------------------------------------------
		System.out.println("Enter the fifth city: ");
		String city5 = sc.next();
		value = city5.length();
		Character arrayCity5[] = new Character[value];
		for(int i=(value-1);i>=0;i--) {
			arrayCity5[i]=city5.charAt(i);
			System.out.println(arrayCity5[i]);
		}
		//-------------------------------------------------
		System.out.println("Enter the sixsth city: ");
		String city6 = sc.next();
		value = city6.length();
		Character arrayCity6[] = new Character[value];
		for(int i=(value-1);i>=0;i--) {
			arrayCity6[i]=city6.charAt(i);
			System.out.println(arrayCity6[i]);
		}
		
		
		sc.close();
	}
}
