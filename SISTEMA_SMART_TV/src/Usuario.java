public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV Ligada? " + smartTV.ligada);
        smartTV.desligar();
        System.out.println("Tv desligada? " + smartTV.ligada);

        smartTV.canalMais();
        System.out.println("Em qual canal estamos: " + smartTV.canal);

        smartTV.canalMenos();
        System.out.println("Canal menos um: " + smartTV.canal);

        smartTV.mudarCanal(12);
        System.out.println("Em qual canal estamos: " + smartTV.canal);

        smartTV.aumentarVolume();
        System.out.println("Volume aumentou para: " + smartTV.volume);

        smartTV.diminuirVolume();
        System.out.println("Volume diminuiu para: " + smartTV.volume);

    }
}
