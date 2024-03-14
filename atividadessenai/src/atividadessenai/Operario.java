package atividadessenai;

public class Operario extends Funcionario{
	
	private int horasTrabalhadas;
	private int valorHora;

	public Operario(String nome, int id, Double salarioBase, int horasTrabalhadas, int valorHora) {
		super(nome, id, salarioBase);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public int getValorHora() {
		return valorHora;
	}

	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}	
	
	@Override
    public double calcularSalario() {
        return getSalarioBase() + (horasTrabalhadas * valorHora);
    }
}