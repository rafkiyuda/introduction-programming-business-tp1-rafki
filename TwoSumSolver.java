import java.util.Scanner;
import java.util.Arrays;

public class TwoSumSolver {

    public static int[] findTwoSum(int[] nums, int target) throws Exception {
        // Penanganan eksepsi jika input kosong
        if (nums == null || nums.length == 0) {
            throw new Exception("Error: Array input tidak boleh kosong!");
        }

        // Algoritma Brute Force untuk mencari dua angka
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // Jika tidak ditemukan solusi
        throw new Exception("Tidak ada dua angka yang menghasilkan target tersebut.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah elemen dalam array: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                throw new Exception("Error: Jumlah elemen harus lebih dari 0!");
            }

            int[] nums = new int[n];
            System.out.println("Masukkan elemen array:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            System.out.print("Masukkan target: ");
            int target = scanner.nextInt();

            int[] result = findTwoSum(nums, target);
            System.out.println("Output: " + Arrays.toString(result));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
