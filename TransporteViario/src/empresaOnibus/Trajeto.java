package empresaOnibus;

import java.util.ArrayList;
import java.util.Date;

public class Trajeto {
	ArrayList<Trecho> trechos;
	Checkpoint pontoFinal;
	Funcionario motorista;
	Funcionario cobrador;
	ArrayList<Date> dataHoraInicio;
	ArrayList<Date> horaFim;
	
	public Trajeto() {
		super();
		this.trechos = new ArrayList<Trecho>();
		this.dataHoraInicio = new ArrayList<Date>();
		this.horaFim = new ArrayList<Date>();
	}
	
	public Trajeto(ArrayList<Trecho> trechos, Motorista motorista,Checkpoint pontoFinal ) {
		super();
		this.motorista = motorista;
		this.trechos = trechos;
		this.pontoFinal = pontoFinal;
		this.dataHoraInicio = new ArrayList<Date>();
		this.horaFim = new ArrayList<Date>();
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
	
	public void registroInicio(Date dataHora) {
		//regista a data e hora do inicio do trajeto
	}
	
	public void registrarFim() {
		//registra a data e hora em que o veiculo chegou ao fim do trajeto.
	}
}
