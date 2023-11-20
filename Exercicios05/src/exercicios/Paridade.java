package exercicios;

public class Paridade {
	
	public static String paridade(int num) {
		if(num%2==0)
			return "É par!";
		else
			return "É impar!";
	}
	
	public static void main(String[] args) {
		System.out.println(paridade(2));
	}
}
