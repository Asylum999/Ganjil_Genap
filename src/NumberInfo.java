/**
 * Kelas pembantu untuk menyimpan informasi dan operasi terkait angka.
 */
public class NumberInfo {
    private final int value;

    /** Konstanta pembagi untuk menentukan genap/ganjil. */
    public static final int DIVISOR = 2;

    /**
     * Konstruktor untuk membuat objek NumberInfo.
     *
     * @param value nilai angka yang akan disimpan
     */
    public NumberInfo(int value) {
        this.value = value;
    }

    /**
     * Mengambil nilai angka yang disimpan.
     *
     * @return nilai angka
     */
    public int getValue() {
        return value;
    }

    /**
     * Menentukan apakah angka adalah bilangan genap.
     *
     * @return true jika angka genap, false jika ganjil
     */
    public boolean isEven() {
        return value % DIVISOR == 0;
    }
}

