import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[] alunos = {"Camila", "Lucas", "Bruna", "Felipe"};

        int media = calculaMediaDaTurma(alunos, input);

        System.out.printf("Média da turma: %d ", media);
        System.out.println("");
    }

    public static int calculaMediaDaTurma(String[] alunos, Scanner input) {

        int soma = 0;
        for(String aluno: alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = input.nextInt();
            soma += nota;
        }
        return soma/alunos.length;
    }
}
