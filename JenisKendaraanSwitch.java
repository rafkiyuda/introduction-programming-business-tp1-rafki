import java.util.Scanner;

public class JenisKendaraanSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan: ");
        String kendaraan = input.nextLine().toLowerCase();

        switch (kendaraan) {
            case "motor":
                System.out.println("Kendaraan roda dua.");
                break;
            case "mobil":
                System.out.println("Kendaraan roda empat.");
                break;
            default:
                System.out.println("Jenis kendaraan lainnya.");
        }
    }
}
