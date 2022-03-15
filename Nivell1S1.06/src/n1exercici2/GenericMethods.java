package n1exercici2;

public class GenericMethods<T> {
	
//ATRIBUTS
	
	private T primero;
	
//CONSTRUCTORS
	
	public GenericMethods(T primero) {
		this.primero = primero;
	}
	
//GETTERS Y SETTERS
	
	public T getPrimero() {
		return primero;
	}

	public void setPrimero(T primero) {
		this.primero = primero;
	}
	
//METODES
	
	public static <T> void f(T primero, T segon, T tercer) {
		
		System.out.printf("%s \n", primero);
		System.out.printf("%s \n", segon);
		System.out.printf("%s \n", tercer);
		
		
		}
	}

	

	
	
	



