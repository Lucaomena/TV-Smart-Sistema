public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentou para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuiu para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void canalMais(){
        ++canal;
    }

    public void canalMenos(){
        --canal;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}