package atividadessenai;

public class Gerente extends Funcionario {
	private Double bonus;

	public Gerente(String nome, int id, Double salarioBase, Double bonus) {
		super(nome, id, salarioBase);
		this.bonus = bonus;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
	@Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
}
