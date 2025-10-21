# Proyek Droid Cafe - Praktikum Pemrograman Aplikasi Mobile

Repositori ini berisi proyek "Droid Cafe" yang dibuat sebagai bagian dari tugas praktikum mata kuliah Pemrograman Aplikasi Mobile (PAM). Proyek ini mencakup implementasi dasar interaksi pengguna (User Interaction) pada Android menggunakan Kotlin.

---

## Informasi Pengguna

* **Nama:** [Muhammad Eka Mandiri Sujanto]
* **NIM/ID:** [1237050079]
* **Mata Kuliah:** Pemrograman Aplikasi Mobile

---

## Deskripsi Proyek

Aplikasi "Droid Cafe" adalah aplikasi sederhana yang mensimulasikan menu kafe. Proyek ini terdiri dari dua bagian utama:

1.  [cite_start]**Halaman Utama (Droid Desserts):** Menampilkan tiga gambar *dessert* (Donut, Ice Cream, Froyo) yang dapat diklik[cite: 424, 435]. [cite_start]Setiap gambar memiliki deskripsi teks di sebelahnya[cite: 457].
2.  [cite_start]**Halaman Order (Order Activity):** Sebuah formulir pemesanan yang diakses melalui *Floating Action Button* (FAB)[cite: 657]. [cite_start]Halaman ini berisi berbagai komponen input untuk memasukkan data pesanan[cite: 673].

---

## Fitur yang Diimplementasikan

### Modul 1: Halaman Utama (User Interaction)

* [cite_start]**ImageView:** Menampilkan gambar-gambar *dessert*[cite: 406, 424].
* [cite_start]**OnClickListener:** Memberikan aksi klik pada setiap `ImageView`[cite: 579].
* [cite_start]**Toast:** Menampilkan pesan singkat (Toast) yang berbeda-beda saat setiap gambar diklik (misalnya: "You ordered a donut.")[cite: 581, 584].
* [cite_start]**FloatingActionButton (FAB):** Mengganti ikon FAB default menjadi ikon keranjang belanja[cite: 644, 649].
* [cite_start]**Intent:** Memberikan aksi pada FAB untuk berpindah dari `MainActivity` ke `OrderActivity` menggunakan `Intent`[cite: 657, 667].

### Modul 2 & Tugas: Halaman Order (Input Controls)

* [cite_start]**LinearLayout:** Menggunakan `LinearLayout` sebagai *layout* utama untuk formulir pemesanan[cite: 789].
* [cite_start]**EditText:** Menerima input teks dari pengguna untuk Nama, Alamat, dan Telepon[cite: 674, 695, 712, 729].
* [cite_start]**RadioGroup & RadioButton:** Menyediakan pilihan eksklusif untuk metode pengiriman (Same day, Next day, Pick up)[cite: 674, 752].
* [cite_start]**Penanganan Event RadioButton:** Menampilkan Toast yang sesuai ketika salah satu opsi `RadioButton` dipilih[cite: 898, 911].
* [cite_start]**Tugas: Spinner:** Menambahkan komponen `Spinner` (dropdown) untuk memilih "City" (Kota)[cite: 933].
* [cite_start]**Tugas: EditText (Lanjutan):** Menambahkan `EditText` tambahan untuk "Notes" (Catatan) sesuai permintaan tugas[cite: 933, 934].

---

## Cara Menjalankan

1.  **Clone** repositori ini ke komputer lokal Anda.
    ```bash
    git clone [URL_REPO_ANDA.git]
    ```
2.  Buka proyek menggunakan **Android Studio**.
3.  Tunggu hingga proses *Gradle Sync* selesai.
4.  **Run** aplikasi pada Emulator Android atau perangkat Android fisik.
