import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Antes de iniciarmos, informe seu saldo atual: ");
        double saldoAtual = input.nextDouble();

        System.out.println("*-* Escolha uma das opções *-*");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Encerrar");

        int op = input.nextInt();

        switch (op) {
            case 1:
                System.out.println("Qual valor a ser depositado?");
                double deposito = input.nextDouble();
                saldoAtual = saldoAtual + deposito;
                System.out.println("Deposito concluído com sucesso");
                System.out.println("Seu saldo atual é de R$ " + (String.format("%.1f",saldoAtual)));
                System.out.println("Programa encerrado.");
                break;
            case 2:
                System.out.println("Qual valor a ser sacado?");
                double saque = input.nextDouble();
                saldoAtual = saldoAtual - saque;
                if (saque>saldoAtual) {
                    System.out.println("Seu saldo é insuficiente!");
                    System.out.println("Programa encerrado.");
                } else {
                System.out.println("Deposito concluído com sucesso");
                System.out.println("Seu saldo atual é de R$ " + (String.format("%.1f",saldoAtual)));
                System.out.println("Programa encerrado.");
                }
                break;
            case 3:
                System.out.println("Seu saldo atual é de R$ " + (String.format("%.1f",saldoAtual)));
                System.out.println("Programa encerrado.");
                break;
            case 4:
                System.out.println("Programa encerrado.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        input.close();

    }
}

/**
 * import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class simulacaoBancaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintStream var = System.out;

        double amount = 0.0;

        try {
            scanner.useLocale(Locale.US);

            boolean running = true;
            while (running) {

                int option = scanner.nextInt();
                double value = 50.0;

                switch (option) {
                    case 1:

                        value = scanner.nextDouble();
                        amount += value;

                        var.println("Saldo atual: " + amount);

                        break;
                    case 2:

                        value = scanner.nextDouble();

                        if (value > amount) {
                            var.println("Saldo insuficiente.");
                        } else {
                            amount -= value;
                            var.println("Saldo atual: " + amount);
                        }

                        break;
                    case 3:

                        var.println("Saldo atual: " + amount);

                        break;
                    case 4:
                    case 0:

                        var.println("Programa encerrado.");
                        running = false;

                        continue;
                    default:

                        var.println("Opção inválida. Tente novamente.");
                        break;
                }
            }
        } finally {
            scanner.close();
        }
    }
}
 */