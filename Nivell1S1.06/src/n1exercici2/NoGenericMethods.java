package n1exercici2;

public class NoGenericMethods {

//ATRIBUTS
	private String frase;
	private String oracion;
	private String sentencia;
	
//CONSTRUCTORS
	
	public NoGenericMethods(String frase, String oracion, String sentencia) {
		this.frase = frase;
		this.oracion = oracion;
		this.sentencia = sentencia;
	}
	public NoGenericMethods() {
		frase = "Hola";
		oracion = "Es un gato";
		sentencia = "Soy Batman";
	}
	

//GETTERS Y SETTERS
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public String getOracion() {
		return oracion;
	}

	public void setOracion(String oracion) {
		this.oracion = oracion;
	}

	public String getSentencia() {
		return sentencia;
	}

	public void setSentencia(String sentencia) {
		this.sentencia = sentencia;
	}
	
	
//METODES
	
	@Override
	public String toString() {
		return "NoGenericMethods [frase=" + frase + ", oracion=" + oracion + ", sentencia=" + sentencia + "]";
	}

}
