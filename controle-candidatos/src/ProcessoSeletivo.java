import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        List<String> candidatosSelecionados = selecaoCandidatos();
        imprimirSelecionados(candidatosSelecionados);
    }

    public static void imprimirSelecionados(List<String> candidatosSelecionadosList) {
        System.out.println("Candidatos selecionados:");
        for (String candidato : candidatosSelecionadosList) {
            System.out.println(candidato);
        }
        ligarCandidatos(candidatosSelecionadosList);
    }

    private static void ligarCandidatos(List<String> candidatosSelecionadosList) {
        for (String candidato : candidatosSelecionadosList) {
            entrandoEmContato(candidato);
        }
    }

    public static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu) {
            System.out.println("Conseguimos contato com o " + candidato + ", na tentativa: " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com o candidato " + candidato);
        }
    }

    public static boolean atender() {
        return ThreadLocalRandom.current().nextInt(3) == 1;
    }

    public static List<String> selecaoCandidatos() {
        String[] candidatos = { "Ana", "Paulo", "Luan", "Julia", "Lia", "Wesley", "Letícia", "Larissa", "Cassia",
                "Evandro" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        List<String> candidatosSelecionadosList = new ArrayList<>();

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(
                    "O(A) candidato(a) " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O(A) candidato(a) " + candidato + " foi selecionado(a) para a vaga!");
                candidatosSelecionadosList.add(candidato);
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
        return candidatosSelecionadosList;
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM OUTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}