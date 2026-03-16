import java.util.Scanner;

public class JenisKendaraanIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jenis kendaraan: ");
        String kendaraan = input.nextLine();

        if (kendaraan.equalsIgnoreCase("motor")) {
            System.out.println("Kendaraan roda dua.");
        } else if (kendaraan.equalsIgnoreCase("mobil")) {
            System.out.println("Kendaraan roda empat.");
        } else {
            System.out.println("Jenis kendaraan lainnya.");
        }
    }
}
