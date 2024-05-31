public class ResultadoEscolar {
    public static void main(String[] args) {
        
        //Operador ternário: 
        //int nota = 7;
        //String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        //System.out.println(resultado);

        double nota = 5.0;

        if(nota>=7) {
            System.out.println("Aprovado!");
        } else if (nota>=5 && nota<7) {
            System.out.println("Prova de recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
