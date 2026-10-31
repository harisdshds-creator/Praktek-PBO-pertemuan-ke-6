import java.util.ArrayList;

public class MainTransportasi {
    public static void main(String[] args) {
        ArrayList<Kendaraan> armada = new ArrayList<>();
        armada.add(new Mobil("B 1234 XX", "Toyota Avanza"));
        armada.add(new Motor("B 5678 YY", "Honda Vario"));
        armada.add(new Deluxe("B 9999 ZZ", "Toyota Alphard")); // Penambahan objek Deluxe

        int jarak = 10;
        for (Kendaraan k : armada) {
            k.cetakResi(jarak);
        }
    }
}