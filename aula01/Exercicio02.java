import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, prestacao, limite;

        System.out.println("Digite o valor do salário bruto");
        salarioBruto = teclado.nextDouble();
        System.out.println("Digite o valor da prestaçao");
        prestacao = teclado.nextDouble();
        System.out.println("");

        limite = salarioBruto * 0.3;

        if (prestacao <= limite) {
            System.out.println("Empréstimo disponível.");
        } else {
            System.out.println("Empréstimo indisponível no momento.");
        }

        teclado.close();
    }
}
