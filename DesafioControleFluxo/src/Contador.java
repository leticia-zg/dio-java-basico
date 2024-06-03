import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o primeiro parâmetro");
        int parametroUm = input.nextInt();
        System.out.println("Escreva o segundo parâmetro");
        int parametroDois = input.nextInt();
        input.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
		}
		
	}

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm>parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }

}