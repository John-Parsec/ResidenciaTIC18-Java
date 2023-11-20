package quiz;

import java.util.ArrayList;

public class Pergunta {
	private String pergunta;
	private ArrayList<String> alternativas;
	private int alternativaCerta;
	private boolean certo;
	
	public Pergunta() {
		super();
		this.alternativas = new ArrayList<String>();
	}

	public Pergunta(String pergunta, ArrayList<String> alternativas, int alternativaCerta) {
		super();
		this.pergunta = pergunta;
		this.alternativas = alternativas;
		this.alternativaCerta = alternativaCerta;
	}
	
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	
	public int getAlternativaCerta() {
		return alternativaCerta;
	}
	public void setAlternativaCerta(int alternativaCerta) {
		this.alternativaCerta = alternativaCerta;
	}

	public boolean isCerto() {
		return certo;
	}
	
	public void setCerto(boolean certo) {
		this.certo = certo;
	}

	public ArrayList<String> getAlternativas() {
		return alternativas;
	}
	public void addAlternativa(String alternavia) {
		this.alternativas.add(alternavia);
	}
}
