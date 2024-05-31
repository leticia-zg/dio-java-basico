public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while (tocando());

        System.out.println("Alô!!");
    }

    

    private static boolean tocando() {
        boolean atendeu = true;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu; 
    }
}
