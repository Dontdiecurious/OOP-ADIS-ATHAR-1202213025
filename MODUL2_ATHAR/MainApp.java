public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasiair = new TransportasiAir(0, 0);
        transportasiair.informasi();
        transportasiair.berlayar();
        transportasiair.berlabuh();

        System.out.println("");

        Sampan sampan = new Sampan(0, 0, 0);
        sampan.informasi();
        sampan.berlabuh();
        sampan.berlabuh(2);

        System.out.println("");

        Kapal kapal = new Kapal(0, 0, "");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();
        
        System.out.println("");
    }
}
