package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	private ArrayList<Pergunta> perguntas;
	
	public Quiz() {
		super();
		perguntas = new ArrayList<Pergunta>();
	}

	public Quiz(ArrayList<Pergunta> perguntas) {
		super();
		this.perguntas = perguntas;
	}

	public ArrayList<Pergunta> getPerguntas() {
		return perguntas;
	}
	
	public void addPergunta(Pergunta p) {
		perguntas.add(p);
	}
	
	public void addPergunta() {
		Pergunta p = new Pergunta();
		String resposta;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a pergunta?");
		resposta = sc.next();
		p.setPergunta(resposta);
				
		for(i = 1; i <= 4; i++) {
			System.out.println("Adcione a alternativa " + i);
			resposta = sc.next();
			p.addAlternativa(resposta);		
		}
		
		System.out.println("Qual a alternativa correta? (1 - 4)");
		resposta = sc.next();
		
		p.setAlternativaCerta(Integer.parseInt(resposta) - 1);
		
		perguntas.add(p);
		
		sc.close();
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	}



}
