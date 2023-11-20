package exercicios;

public class AreaRetangulo {
	
	public static float areaRet(float alt, float larg) {
		return alt * larg;
	}
	
	public static void main(String[] args) {
		int h, l;
		h = 10;
		l = 20;
		System.out.println(areaRet(h, l));
	}
}
