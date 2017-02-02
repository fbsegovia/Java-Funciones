package main;

//Al implementar el método "Comparable" compara un
public class Persona implements Comparable<Persona> {
	private String nombre;
	private int edad;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	/*Método que hace que si dos objetos sean iguales en contenido
	hace que sean iguales, en vez de dos objetos con el mismo contenido
	,es decir, si dos objetos apuntan a la misma referencia son iguales.*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	/*Return entero
	Si devolvemos un numero negativo quiere decir que este objeto es menor que el objeto "p".
	Si devolviesemos 0, quiere decir que son iguales.
	Si devolviesemos un numero positivo, quiere decir que este objeto es mayor que el objeto "p".*/
	@Override
	public int compareTo(Persona p) {
		return this.edad - p.edad;
	}
	
	
	
}
