import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        //valueOf = converte string em double
        //Number valor = Double.valueOf("a1.75");

        Number valor;
        //tenta converter a string para um valor
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

            //se não der certo, 
        } catch(ParseException e) {
            e.printStackTrace();
        }
    }
}
