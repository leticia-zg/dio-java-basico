import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
	        
        //input para receber dados do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o número da sua conta? ");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual seu nome? ");
        String nomeDoUsuario = scanner.nextLine();

        System.out.println("Qual agência? ");
        String numeroDaAgencia = scanner.nextLine();

        System.out.println("Qual seu saldo atual? ");
        float saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá " + nomeDoUsuario+ ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroDaAgencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + ".");
    }

}
