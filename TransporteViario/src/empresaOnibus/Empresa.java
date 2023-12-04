package empresaOnibus;

import java.util.ArrayList;

public class Empresa {
	private String nome;
	private String cnpj;
	
	ArrayList<Funcionario> funcionarios;
	ArrayList<Passageiro> passageiros;
	ArrayList<Veiculo> veiculos;
	ArrayList<Trajeto> trajetos;
	ArrayList<Trecho> trechos;
	ArrayList<Jornada> jornadas;
	
	public Empresa(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionarios = new ArrayList<Funcionario>();
		this.passageiros = new ArrayList<Passageiro>();
		this.veiculos = new ArrayList<Veiculo>();
		this.trajetos = new ArrayList<Trajeto>();
		this.trechos = new ArrayList<Trecho>();
		this.jornadas = new ArrayList<Jornada>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	public ArrayList<Passageiro> getPassageiros() {
		return passageiros;
	}
	public void addPassageiros(Passageiro passageiro) {
		this.passageiros.add(passageiro);
	}
	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void addVeiculos(Veiculo veiculo) {
		this.veiculos.add(veiculo);
	}
	public ArrayList<Trajeto> getTrajetos() {
		return trajetos;
	}
	public void addTrajetos(Trajeto trajeto) {
		this.trajetos.add(trajeto);
	}
	public ArrayList<Trecho> getTrechos() {
		return trechos;
	}
	public void addTrechos(Trecho trecho) {
		this.trechos.add(trecho);
	}
	public ArrayList<Jornada> getJornadas() {
		return jornadas;
	}
	public void addJornadas(Jornada jornada) {
		this.jornadas.add(jornada);
	}
	public void menu() {
		//Menu principal
		//Cria uma interface visual para o usuario
		//Exibe as informações necessarias e pega os dados necessarios do usuario
		//Chama os metodos necessarios dependendo da escolha do usuario
	}
	
	public void cadastrarFuncionario() {
		//Cadastra um funcionario na empresa
		// Pega os dados do usuario e cria um funcionario
	}
	
	public void cadastrarVeiculo() {
		//Cadastra um veiculo na empresa
		//Pega os dados do usuario e cria um veiculo
	}
	
	public void cadastrarPassageiro() {
		//Cadastra um passageiro na empresa
		//Pega os dados do usuario e cria um passageiro
	}
	
	public void cadastrarTrajeto() {
		//Cadastra um trajeto
		//Exibe os trechos disponiveis
		//Após, exibe os pontos disponiveis no trajeto criado (para escolher qual será o checkpoint)
		//Pega os dados do usuario e cria um trajeto
	}
	
	public void cadastrarTrecho() {
		//Cadastra um trajeto
		//Exibe os pontos disponiveis
		//Pega os dados do usuario e cria um trecho
	}
	
	public void cadastrarTrecho(PontoParada origem, PontoParada destino) {
		//Cadastra um trajeto
		//cria um trecho com os parametros recebidos
	}
	
	public void cadastraPonto() {
		//Cadastra um ponto
		//Pega os dados do usuario e cria um ponto
	}
	
	public void registroJornada(Trajeto t, Motorista m, Veiculo v) {
		//registra uma nova jornada
	}
	
	public void atualizaJornada() {
		//exibe as jornadas disponiveis
		//atualiza uma jornada, podendo:
		//adcionar um cobrador
		//trocar funcinarios
		//trocar veiculo
		//trocar trajeto
	}
	
	public void registrarPassagemCheckpoint() {
		//registra que o veiculo chegou no checkpoint;
		//chama o registroInicio ou o registrarFim do trajeto associado;
		//dependendo do tipo de trajeto atual;
	}
	
	public void registroEmbarque(Passageiro p) {
		//chama o metodo embarcarOnibus do passageiro;
	}
}
