public class MainApp {
    public static void main(String[] args){
        System.out.print("");
        
        Perangkat perangkat = new Perangkat("Adata", 2, 1.80f);
        perangkat.informasi();

        System.out.println("");
    
        Laptop laptop = new Laptop("Seagate", 8, 2.40f, true);
        laptop.informasi();
        laptop.bukaGame("The Sims");
        laptop.kirimEmail("Carrie&Lowell@gmail.com");
        laptop.kirimEmail("Midnights@gmail.com", "NFR!@gmail.com");

        System.out.println("");

        Handphone handphone = new Handphone("Sandisk", 6, 2.20f, false);
        handphone.informasi();
        handphone.telfon(628133934);
        handphone.kirimSMS(628766329);
        handphone.kirimSMS(62877997, 62729839);


    }
    
}
