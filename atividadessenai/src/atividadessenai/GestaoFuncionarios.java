package atividadessenai;

import java.util.ArrayList;
import java.util.List;

public class GestaoFuncionarios {

    private List<Funcionario> funcionarios;

    public GestaoFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario func) {
        funcionarios.add(func);
    }

    public void calcularSalarios() {
        double totalSalarios = 0;
        for (Funcionario func : funcionarios) {
            totalSalarios += func.calcularSalario();
        }
        System.out.println("Salário total dos funcionários: " + totalSalarios);
    }

    public void listarFuncionarios() {
        for (Funcionario func : funcionarios) {
            System.out.println(func);
        }
    }
}
