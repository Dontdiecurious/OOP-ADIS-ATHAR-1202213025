public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir (int jumlahkursi, int biaya){
        this.jumlahKursi = jumlahkursi;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis yang tidak dekatahui dengan kursi berjumlah ", + jumlahKursi + "ditetapkan dengan biaya sebesar Rp." + biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");

    }

    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlabuh di pantai");
    }

}

