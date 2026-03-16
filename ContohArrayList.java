import java.util.ArrayList;

public class ContohArrayList {

    public static void main(String[] args) {

        ArrayList<String> produk = new ArrayList<>();

        // menambahkan elemen
        produk.add("Laptop");
        produk.add("Mouse");
        produk.add("Keyboard");

        System.out.println("Daftar produk: " + produk);

        // menghapus elemen
        produk.remove("Mouse");

        System.out.println("Setelah penghapusan: " + produk);
    }
}
