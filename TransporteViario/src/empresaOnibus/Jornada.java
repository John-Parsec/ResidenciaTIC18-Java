package empresaOnibus;

public class Jornada {
	private int horaInicio;
	private int horaFim;
	private Trajeto trajeto;
	private Veiculo onibus;
	
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(int horaFim) {
		this.horaFim = horaFim;
	}
	public Trajeto getTrajetos() {
		return trajeto;
	}
	public void addTrajetos(Trajeto trajeto) {
		this.trajeto = trajeto;
	}
	public Veiculo getOnibus() {
		return onibus;
	}
	public void setOnibus(Veiculo onibus) {
		this.onibus = onibus;
	}
}
