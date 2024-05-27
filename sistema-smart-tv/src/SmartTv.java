public class SmartTv {

    //declarando variáveis
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal) { // usuário escolhe o canal 
        canal = novoCanal;
    }

    public void aumentarCanal() { //mudar de canal (para cima)
        canal++;
    }

    public void diminuirCanal() { //mudar de canal (para baixo)
        canal--;
    }

    public void aumentarVolume() { //aumenta o volume
        volume++;
    }

    public void diminuirVolume() { //diminui o volume
        volume--; 
    }

    public void ligar() { //liga a tv
        ligada = true;
    }

    public void desligar() { //desliga a tv
        ligada = false;
    }
}