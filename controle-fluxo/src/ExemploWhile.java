public class ExemploWhile {
    public static void main(String[] args) {
        int mesada = 50;

        while(mesada>0) {
            int valorDoce = 8;
            if(valorDoce > mesada) 
                valorDoce = mesada;
                
            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;

            System.out.println("Mesada: " + mesada);
        }

        
    }
}
