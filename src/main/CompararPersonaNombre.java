package main;

import java.util.Comparator;

public class CompararPersonaNombre implements Comparator<Persona>{

	
	/*Si devolvemos negativos quiere decir que "o1" es meno2 que "o2",
	si devolvemos 0 quiere decir que "o1" y "o2" son iguales,
	si devolvemos positivos quiere decir que "o1" es mayor que "o2".*/
	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

	
	
}
