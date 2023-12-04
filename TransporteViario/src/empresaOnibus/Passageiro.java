package empresaOnibus;

import java.util.*;

public class Passageiro {
	private String nome;
	private int numeroCartao;
	private int tipoCartao;
	private ArrayList<PontoParada> pontosEmbarque;
	private ArrayList<Date> dataHora;
	
	public Passageiro(String nome, int numeroCartao, int tipoCartao) {
		super();
		this.nome = nome;
		this.numeroCartao = numeroCartao;
		this.tipoCartao = tipoCartao;
		this.pontosEmbarque = new ArrayList<PontoParada>();
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}
	
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
	public int getTipoCartao() {
		return tipoCartao;
	}
	
	public void setTipoCartao(int tipoCartao) {
		this.tipoCartao = tipoCartao;
	}
	
	public ArrayList<PontoParada> getPontosEmbarque() {
		return pontosEmbarque;
	}
	
	public void embarcarOnibus(PontoParada p) {
		//Adiciona o ponto onde o passageiro embarcou na lista de pontos de embarque do passageiro
		//registra a hora
	}
	
	public PontoParada getUltimoEmbarque() {
		//Retorna o ultimo ponto onde o passageiro embarcou em um onibus
		return this.pontosEmbarque.get((this.pontosEmbarque.size()) - 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Date> getDataHora() {
		return dataHora;
	}	
}
