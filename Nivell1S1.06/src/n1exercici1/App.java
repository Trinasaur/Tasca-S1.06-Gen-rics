package n1exercici1;

public class App {

	public static void main(String[] args) {
	NoGenericMethods comprobar1 = new NoGenericMethods("frase", "oracion", "sentencia");
	
	NoGenericMethods comprobar2 = new NoGenericMethods("oracion", "sentencia", "frase");
	
	System.out.println(comprobar1.toString());
	System.out.println(comprobar2.toString());
	
	}
}
