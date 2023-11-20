package exercicios;

public class ConversorTemp {
	
	public static float conversor(float temp, boolean opt) {
		if(opt)
			return (temp * 9/5) + 32;
		else
			return (float) ((temp - 32.0) / 1.8);
	}
	
	public static float celciusParaFahr(float temp) {
		return (temp * 9/5) + 32;
	}

	public static float fahrParCelsius(float temp) {
		return (float) ((temp - 32.0) / 1.8);
	}
	
	public static void main(String[] args) {
		System.out.println(conversor(75, true));
		
		System.out.println(celciusParaFahr(75));
		
		System.out.println(fahrParCelsius(100));
	}
}
