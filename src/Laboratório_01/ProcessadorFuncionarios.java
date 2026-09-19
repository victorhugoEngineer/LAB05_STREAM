package Laboratório_01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessadorFuncionarios {

    public static void main(String[] args) {
        // 2. Criação da Lista de Funcionários
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Ana", 25, 3000.0),
                new Funcionario("Carlos", 35, 4500.0),
                new Funcionario("Beatriz", 42, 6000.0),
                new Funcionario("Daniel", 28, 3500.0),
                new Funcionario("Eduardo", 50, 8000.0)
        );

        gerarRelatorio(funcionarios);
    }

    // 4. Relatório Final
    public static void gerarRelatorio(List<Funcionario> funcionarios) {
        System.out.println("====== RELATÓRIO DE FUNCIONÁRIOS ======\n");

        // 3. Operação de Filtragem (filter)
        System.out.println("1. Funcionários com idade superior a 30 anos:");
        funcionarios.stream()
                .filter(f -> f.getIdade() > 30)
                .forEach(f -> System.out.println(" - " + f.getNome() + " (" + f.getIdade() + " anos)"));

        // 3. Operação de Mapeamento (map)
        System.out.println("\n2. Lista de nomes dos funcionários:");
        List<String> nomes = funcionarios.stream()
                .map(f -> f.getNome())
                .collect(Collectors.toList());
        System.out.println(" " + nomes);

        // 3. Operação de Redução (reduce)
        System.out.println("\n3. Soma total dos salários:");
        double somaSalarios = funcionarios.stream()
                .map(f -> f.getSalario())
                .reduce(0.0, (subtotal, salario) -> subtotal + salario);
        System.out.println(" R$ " + String.format("%.2f", somaSalarios));

        System.out.println("\n=======================================");
    }
}