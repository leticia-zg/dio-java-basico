import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        
        try {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = input.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.next();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        System.out.println("Olá, me chamo " + nome + sobrenome);
        System.out.println("Tenho: " + idade + "anos. E minha altura é: " + altura + "metros");

        input.close();
        } 
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
