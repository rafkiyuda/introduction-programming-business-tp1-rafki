import java.util.Scanner;

public class PalindromeChecker {

    /**
     * Metode untuk memeriksa apakah sebuah bilangan adalah palindrom.
     * Menggunakan logika pembalikan angka (reverse integer).
     */
    public static boolean isPalindrome(int x) {
        // Angka negatif bukan palindrom (misal: -121 dibaca dari belakang 121-)
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        // Gunakan while loop untuk membalikkan angka
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Bandingkan angka asli dengan angka yang sudah dibalik
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: x = ");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            boolean result = isPalindrome(input);
            System.out.println("Output: " + result);
        } else {
            System.err.println("Error: Silakan masukkan bilangan bulat yang valid.");
        }

        scanner.close();
    }
}
