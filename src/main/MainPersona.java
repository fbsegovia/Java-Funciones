package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MainPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Felix");
		p1.setEdad(37);
		
		Persona p2 = new Persona();
		p2.setNombre("Maria");
		p2.setEdad(29);
		
		Persona p3 = new Persona();
		p3.setNombre("Felix");
		p3.setEdad(37);
		
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		
		Set<Persona> conjuntoPersonas = new HashSet();
		conjuntoPersonas.add(p1);
		conjuntoPersonas.add(p2);
		conjuntoPersonas.add(p3);
		
		recorrer(listaPersonas);
		System.out.println("-------");
		recorrer(conjuntoPersonas);
		System.out.println("-------");
		
		if(listaPersonas.contains(p3)){
			System.out.println("La contiene");
		}else{
			System.out.println("No la contiene");
		}
		System.out.println(p1.equals(p3));
	
		System.out.println("**********");
		Collections.sort(listaPersonas);
		recorrer(listaPersonas);
		
		//De esta forma aplicamos el comparador diseñado por nosostros
		//en vez del predefinido.
		System.out.println("--------Comparador Propio--------");
		Collections.sort(listaPersonas, new CompararPersonaNombre());
		recorrer(listaPersonas);
		
	}

	private static void recorrer(Collection<Persona> coleccion) {
		for(Persona persona : coleccion){
			System.out.println(persona);
		}
	}
	
	
}
