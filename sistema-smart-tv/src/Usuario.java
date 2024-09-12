public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTV smartTV = new SmartTV();

        /* System.out.println("TV LIGADA: " + smartTV.ligada);
        System.out.println("CANAL ATUAL: " + smartTV.canal);
        System.out.println("VOLUME ATUAL: " + smartTV.volume);
        */

        // INSTANCIANDO MÉTODO LIGAR:
        smartTV.ligarTV();
        System.out.println("TV LIGADA: " + smartTV.ligada);

        // INSTANCIANDO MÉTODO DE AUMENTAR O VOLUME:
        smartTV.aumentarVolume();
        System.out.println("VOLUME ATUAL: " + smartTV.volume);

        // INSTANCIANDO MÉTODO DE MUDAR CANAL:
        smartTV.mudarCanal(39);
        System.out.println("CANAL ATUAL: " + smartTV.canal);

        // INSTANCIANDO MÉTODO DE PASSAR O CANAL:
        smartTV.aumentarCanal();
        System.out.println("PASSANDO PARA O CANAL: " + smartTV.canal);

    }
}
