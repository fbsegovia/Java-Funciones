package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		List<String> listaStrings = new ArrayList<>();
		listaStrings = new Vector<>();

		//El primer tio lo utiliza
		ArrayList<String> array2 = new ArrayList<>();
		metodoRecorreList(array2);
		
		//El segundo tio utiliza Vector.
		Vector<String> vector = new Vector<>();
		metodoRecorreVector(vector);
		
		/*Al usar la interfaz "List" en vez de la implementacion
		Array o Vector, no necesitamos usar un método epecifico
		para cada una de las implementaciones.*/
		metodoRecorre(array2);
		metodoRecorre(vector);
		
		
		
		Set<String> conjuntoStrings = new HashSet<>();
		//No puede haber elementos repetidos a nivel de "equal()".
		conjuntoStrings.add("Felix");
		conjuntoStrings.add("Pepe");
		conjuntoStrings.add("Felix");
		
		for(String s: conjuntoStrings){
			System.out.println(s);
		}
		
		
		Integer iObjeto = 5;//Boxing, creas un objeto de valor 5.
		int iPrimitivo = new Integer(5);//Unboxing, crea un primitivo "int" que mete dentro de un objeto "integer" de valor 5.
		
		Map<Integer, String> mapaStrings = new HashMap<>();
		//Para añadir a un mapa se usa la clave "put" en vez de "add".
		mapaStrings.put(new Integer(1), "Felix");
		mapaStrings.put(2, "Maria");
		mapaStrings.put(3, "Ramon");
		//Si ponemos una clave repetida, sobrescribe el valor.
		mapaStrings.put(2, "Laura");
		
		String s = mapaStrings.get(2);//Con "get" accedemos a traves de la clave.
		System.out.println(s);
		
		//Al pedir valores que no existen en un "Map" nos devolvera el valor "null".
		s = mapaStrings.get(4);
		System.out.println(s);
		
		listaStrings.add("Felix");
		listaStrings.add("Laura");
		listaStrings.add("Andres");
		listaStrings.add("Ramon");
		//El método contains identifica si aparece un objeto dentro de una lista.
		if(listaStrings.contains("Laura")){
			System.out.println("Laura existe");
		}
		
		Collections.sort(listaStrings);//Ordenamos una lista alfabeticamente o numericamente.
		metodoRecorre(listaStrings);
		
		
	}

	//Este método no esta aquí, esta en otra clase muy muy lejana.
	public static void metodoRecorreList (ArrayList<String> array){
		for(String s: array){
			System.out.println(s);
		}
	}
	public static void metodoRecorreVector (Vector<String> vector){
		for(String s: vector){
			System.out.println(s);
		}
	}
	
	
	
	/**
	 * Método que recorre una interface y devuelve un listado
	 * @param Listado de datos incluidos en una interface List.
	 */
		public static void metodoRecorre (List<String> array){
			for(String s: array){
				System.out.println(s);
			}
		}
	
	
}
