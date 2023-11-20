package exercicios;

public class MaiorIdade {
	public static boolean verMaiorIdade(int idade) {
		if(idade >= 18)
			return true;
		else
			return false;
	}
	
	public static boolean verMaiorIdade(int diaNasc, int mesNasc, int anoNasc, int diaAt, int mesAt, int anoAt) {
		int idade = 0;
		
		if(anoAt > anoNasc) {
			if(mesNasc <= mesAt) {
				if(diaNasc <= diaAt) {
					idade = anoAt - anoNasc;
				}
				else {
					idade = anoAt - anoNasc - 1;
				}
			}
			else {
				idade = anoAt - anoNasc - 1;
			}
		}
		
		if(idade >= 18)
			return true;
		else
			return false;
	}
		
	public static void main(String[] args) {
		System.out.println("Por idade: " + verMaiorIdade(17));
		System.out.println("Por data: " + verMaiorIdade(20, 11, 2005, 20, 11, 2023));
	}
}
