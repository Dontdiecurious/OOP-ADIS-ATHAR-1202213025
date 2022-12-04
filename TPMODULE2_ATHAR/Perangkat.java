public class Perangkat {

    protected String Drive;

    protected int ram;

    protected float processor;

    public Perangkat(String drive, int ram, float processor) {

        this.Drive = drive;

        this.ram = ram;

        this.processor = processor;

    }

    public void informasi() {
        System.out.println("Perangkat ini tidak diketahui memiliki drive tipe " + Drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz");
    }
}
