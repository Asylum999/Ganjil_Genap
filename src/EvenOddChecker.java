import java.util.Scanner;


/**
 * Program utama untuk memeriksa apakah sebuah angka adalah bilangan genap atau ganjil.
 * Menggunakan implementasi dari antarmuka {@link NumberChecker}.
 */
public class EvenOddChecker {
    /**
     * Entry point dari program.
     * Meminta input angka dari pengguna dan menampilkan hasil pemeriksaan genap/ganjil.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int inputNumber = scanner.nextInt();

        NumberChecker checker = new EvenOddCheckerImpl();
        System.out.println(checker.check(inputNumber));

        scanner.close();
    }
}


