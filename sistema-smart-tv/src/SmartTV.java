public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // MÉTODOS DE LIGAR E DESLIGAR TV:
    public void ligarTV(){
        ligada = true;
    }
    public void desligarTV(){
        ligada = false;
    }

    // MÉTODOS DE AUMENTAR E DIMINUIR VOLUME DA TV:
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    // MÉTODOS DE PASSAR O CANAL DA TV:
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
}