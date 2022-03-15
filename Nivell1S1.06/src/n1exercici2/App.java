package n1exercici2;

public class App {

	public static void main(String[] args) {
	
		int[] numeros = new int[] {1, 2, 3};
		
		GenericMethods<String> oObj = new GenericMethods<String>("Hola");
		
		GenericMethods.f(oObj.getPrimero(), 0.5, 1234564);
		
		GenericMethods.f("hola", 0.5, 1234564);
		
		GenericMethods.f(numeros, 0.5, 1234564);
	
	}

}
