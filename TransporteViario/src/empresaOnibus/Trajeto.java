package empresaOnibus;

import java.util.ArrayList;
import java.util.Date;

public class Trajeto {
	private ArrayList<Trecho> trechos;
	private Checkpoint pontoFinal;
	private Funcionario motorista;
	private Funcionario cobrador;
	private ArrayList<Date> dataHoraInicio;
	private ArrayList<Date> horaFim;
	private String tipoTrajeto; 		//Ida ou Volta
	private ArrayList<Integer> intervalos;
	
	public Trajeto() {
		super();
		this.trechos = new ArrayList<Trecho>();
		this.dataHoraInicio = new ArrayList<Date>();
		this.horaFim = new ArrayList<Date>();
		this.tipoTrajeto = "Ida";
	}
	
	public Trajeto(ArrayList<Trecho> trechos, Motorista motorista,Checkpoint pontoFinal, int intervalo) {
		super();
		this.motorista = motorista;
		this.trechos = trechos;
		this.pontoFinal = pontoFinal;
		this.dataHoraInicio = new ArrayList<Date>();
		this.horaFim = new ArrayList<Date>();
		this.tipoTrajeto = "Ida";
	}
	
	public String getTipoTrajeto() {
		return tipoTrajeto;
	}

	public void setTipoTrajeto(String tipoTrajeto) {
		this.tipoTrajeto = tipoTrajeto;
	}

	public ArrayList<Trecho> getTrechos() {
		return trechos;
	}

	public ArrayList<Date> getDataHoraInicio() {
		return dataHoraInicio;
	}

	public ArrayList<Date> getHoraFim() {
		return horaFim;
	}

	public void addPonto(Trecho p) {
		//Adciona um ponto ao trajeto
		this.trechos.add(p);
	}

	public ArrayList<Trecho> getPontos() {
		return trechos;
	}

	public Checkpoint getPontoFinal() {
		return pontoFinal;
	}

	public void setPontoFinal(Checkpoint pontoFinal) {
		this.pontoFinal = pontoFinal;
	}

	public Funcionario getMotorista() {
		return motorista;
	}

	public void setMotorista(Funcionario motorista) {
		this.motorista = motorista;
	}

	public Funcionario getCobrador() {
		return cobrador;
	}

	public void setCobrador(Funcionario cobrador) {
		this.cobrador = cobrador;
	}
	
	public ArrayList<Integer> getIntervalo() {
		return intervalos;
	}
	
	public void addIntervalo(int intervalo) {
		this.intervalos.add(intervalo);
	}

	public void registroInicio(Date dataHora) {
		//regista a data e hora do inicio do trajeto
		//seta o tipo de trajeto
	}
	
	public void registrarFim() {
		//registra a data e hora em que o veiculo chegou ao fim do trajeto.
		//altera o tipo de trajeto
	}
}
