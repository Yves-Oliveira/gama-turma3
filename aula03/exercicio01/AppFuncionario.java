package exercicio01;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Joaquim", 30, 60);
        Senior s = new Senior("Benjamim", 40, 130, 10);

        System.out.println(f.exibirDados());
        System.out.println("Salario = R$ " + f.calcularSalario());
        System.out.println(s.exibirDados());
        System.out.println("Salario = R$ " + s.calcularSalario());
    }
}
