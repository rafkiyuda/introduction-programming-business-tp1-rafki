public class Mahasiswa {

    String nama;

    void tampilkanNama() {
        System.out.println("Nama mahasiswa: " + nama);
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Rafki";
        mhs.tampilkanNama();
    }
}
