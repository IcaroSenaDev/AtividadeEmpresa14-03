package atividadessenai;

public class Main {
	public static void main(String[] args) {
		GestaoFuncionarios gestao = new GestaoFuncionarios();

		Funcionario func1 = new Gerente("João Silva", 1234, 1000.0, 300.0);
		Funcionario func2 = new Operario("Maria Oliveira", 4567, 2000.0, 80, 6);

		gestao.adicionarFuncionario(func1);
		gestao.adicionarFuncionario(func2);

		gestao.calcularSalarios();

		gestao.listarFuncionarios();

	}
}
