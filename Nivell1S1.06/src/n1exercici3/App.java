package n1exercici3;

public class App {

	public static void main(String[] args) {
	
		
		GenericMethods oObj = new GenericMethods("Hola"); //NO PARAMETRITZAT; POT CAUSAR ERRORS EN EL RUNNING
		
		GenericMethods.f(oObj.getPrimero(), 0.5, 1234564);
		
		
	
	}

}
