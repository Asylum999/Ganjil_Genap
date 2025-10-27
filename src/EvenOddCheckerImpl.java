/**
 * Implementasi dari antarmuka {@link NumberChecker} untuk memeriksa apakah angka genap atau ganjil.
 */
public class EvenOddCheckerImpl implements NumberChecker {

    /**
     * Memeriksa apakah angka yang diberikan adalah genap atau ganjil.
     *
     * @param inputNumber angka yang akan diperiksa
     * @return String hasil pemeriksaan, menyatakan apakah angka genap atau ganjil
     */
    @Override
    public String check(int inputNumber) {
        NumberInfo info = new NumberInfo(inputNumber);
        return info.isEven()
                ? inputNumber + " adalah bilangan genap."
                : inputNumber + " adalah bilangan ganjil.";
    }
}


