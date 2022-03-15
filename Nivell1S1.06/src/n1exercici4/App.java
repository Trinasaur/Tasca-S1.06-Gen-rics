package n1exercici4;
import java.util.*;

public class App {

	public static <T> void main(String[] args) {
		
		GenericMethods<T> genericMethod = new GenericMethods<T>();
		
		
		Integer[] numeros = new Integer[] {1, 2, 3};
		
		GenericMethods.f(numeros);
		
		String[] palabras = new String[] {"hola", "AlOlA"};
		
		GenericMethods.f(palabras);
	}

}
