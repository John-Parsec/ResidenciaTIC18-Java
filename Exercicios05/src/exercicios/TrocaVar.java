package exercicios;

public class TrocaVar {
	public static void main(String[] args) {
		int x, y, z;
		
		x = 10;
		y = 5;
		
		System.out.println("Valores Iniciais:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("\nTroca com variavel auxiliar:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		System.out.println("\n-----------------------------------------");
		
		x = 10;
		y = 5;
		
		System.out.println("Valores Iniciais:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;		
		
		System.out.println("\nTroca com XOR:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
