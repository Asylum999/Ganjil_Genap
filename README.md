EvenOddChecker
 Deskripsi
Proyek ini adalah sebuah aplikasi sederhana yang digunakan untuk menentukan apakah sebuah angka termasuk dalam bilangan genap atau ganjil. Aplikasi ini dikembangkan menggunakan Java dan menerapkan prinsip pemrograman berorientasi objek (OOP).'

Fitur Utama
- Meminta input angka dari pengguna
- Mengecek apakah angka tersebut genap atau ganjil
- Menampilkan hasil pemeriksaan kepada pengguna


## Struktur Kode
- : Kelas ini menyimpan informasi tentang angka dan menyediakan metode untuk menentukan apakah angka tersebut genap. `NumberInfo.java`
- : Interface yang mendefinisikan metode `check` untuk pemeriksaan angka. `NumberChecker.java`
- : Implementasi dari yang melakukan logika pemeriksaan angka. `EvenOddCheckerImpl.java``NumberChecker`
- : Kelas utama yang menjalankan aplikasi dan berinteraksi dengan pengguna `EvenOddChecker.java`


## Cara Menjalankan
1. astikan Java SDK versi 23 sudah terinstal di sistem Anda.
2. Clone atau unduh repository ini.
3. Buka proyek di IDE seperti IntelliJ IDEA.
4. Jalankan kelas sebagai aplikasi Java. `EvenOddChecker`
5. Masukkan angka sesuai permintaan untuk melihat hasil pemeriksaan.


## Penggunaan Prinsip Refactoring
Proyek ini juga menunjukkan beberapa prinsip refactoring seperti:
- Penggunaan konstanta () untuk menghindari magic number. `DIVISOR`
- Ekstraksi metode (`isEven()`) untuk memisahkan logika pengecekan.
- Inline variable untuk menyederhanakan kode saat pengembalian hasil.
