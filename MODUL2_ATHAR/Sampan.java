public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahkursi, int biaya, int layar){
        super(jumlahkursi, biaya);
        this.layar = layar;
    }

    @Override

    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah", + jumlahKursi + "ditetapkan dengan biaya sebesar Rp. " + biaya);

    }

    public void berlayar(){
        System.out.println("Transportasi Air jenis sampan sedang berlayar menggunakan" + layar + "layar");

    }

    public void berlabuh(){
        System.out.println("Transportas Air jenis sampan berlabuh di di ")

    }

    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan", + jangkar + " Jangkar");
        
    }
}
