import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual seu saldo atual?");
        double saldo = scanner.nextDouble();
        System.out.println("Qual valor deseja sacar?");
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500.0;

        if (saque<=saldo) {
            System.out.println("Transacao realizada com sucesso");
        } else {
            
            if(saque<=saldo+limiteChequeEspecial) {
               System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
               System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }

        scanner.close();
    }
}