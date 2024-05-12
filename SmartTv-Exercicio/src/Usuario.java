public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv(); // cria novo objeto(será melhor explicado em POO)//
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Aumentando volume para: " +smartTv.volume);
        System.out.println("Canal: " +smartTv.canal);

        smartTv.mudarCanal(11);


        System.out.println("A TV está ligada? " +smartTv.ligada);
        System.out.println("Canal: " +smartTv.canal);
        System.out.println("Volume: " +smartTv.volume);
    }
}
