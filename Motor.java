public class Motor extends Kendaraan {
    public Motor(String platNomor, String merk) {
        super(platNomor, merk);
    }

    @Override
    public double hitungTarif(int jarak) {
        return jarak * 2000;
    }
}