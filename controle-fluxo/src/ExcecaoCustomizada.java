public class ExcecaoCustomizada {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("123233889");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde às regras de negócio!");
        }
    }

    static String formatarCep (String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();
            return "123.233-88";
    }
}
