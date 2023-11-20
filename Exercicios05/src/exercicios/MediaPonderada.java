package exercicios;

public class MediaPonderada {
	public static float mediaPonderada(float n1, float n2, float n3, float p1, float p2, float p3) {
		return ((n1 * p1) + (n2 * p2) + (n3 * p3))/(p1 + p2 + p3);
	}
	
	public static void main(String[] args) {
		System.out.println(mediaPonderada((float)10, (float)6.5, (float)7.3, (float)7.5, (float)1, (float)1.5));
	}
}
