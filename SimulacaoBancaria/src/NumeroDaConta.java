import java.util.Scanner;

public class NumeroDaConta {

    class NumeroInvalidoException extends Exception {
        public NumeroInvalidoException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumeroDaConta nc = new NumeroDaConta();

        System.out.println("Digite o número da sua conta: ");
        String numeroDaConta = input.next();
        input.close();

        try {
            nc.formatarNumero(numeroDaConta);
            System.out.println("Número da conta válido.");
        } catch (NumeroInvalidoException e) {
            System.out.println("Erro: O número da conta é inválido!");
        }
    }

    public void formatarNumero(String numeroDaConta) throws NumeroInvalidoException {
        if (numeroDaConta.length() != 8) {
            System.out.println("Numero de conta invalido. Digite exatamente 8 digitos.");
        }    
    }
}