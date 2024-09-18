## JAVA PROJECT 
by? me and the tools can make me dizzy tbh

{
    1. To-Do-List ( GUI AND CONSOLE )
    2. Mini Games ( GUEST THE NUMBER )
    3. LIBRARY SYSTEM (UMM.. I CANT DESCRIBE IT)
    4. CHATTING SIMULATION (It might look like an 'annoying' chat simulation app)
    5. Simulation of Banking Applications (It's simple, but it works )
}

---

# To-Do List Application

## Deskripsi

Aplikasi To-Do List ini merupakan implementasi sederhana dari daftar tugas (to-do list) yang memungkinkan pengguna untuk membuat, mengedit, dan menghapus tugas. Proyek ini menyediakan dua versi aplikasi:

1. **Versi Konsol** - Menggunakan antarmuka teks untuk berinteraksi dengan pengguna.
2. **Versi GUI** - Menggunakan antarmuka grafis menggunakan Java Swing.

## Fitur

- **Versi Konsol:**
  - Melihat daftar tugas
  - Menambah tugas baru
  - Mengedit tugas yang ada
  - Menghapus tugas dari daftar

- **Versi GUI:**
  - Menampilkan daftar tugas dalam antarmuka grafis
  - Menambah tugas baru
  - Mengedit tugas yang ada dengan dialog input
  - Menghapus tugas dari daftar

## Persyaratan

- Java Development Kit (JDK) versi 8 atau yang lebih baru

## Struktur Proyek

- **`ToDoListConsole.java`**: Implementasi aplikasi To-Do List berbasis konsol.
- **`ToDoListSwing.java`**: Implementasi aplikasi To-Do List berbasis GUI menggunakan Java Swing.

## Cara Menjalankan

### Versi Konsol

1. **Kompilasi Kode:**

   ```bash
   javac ToDoListConsole.java
   ```

2. **Jalankan Aplikasi:**

   ```bash
   java ToDoListConsole
   ```

### Versi GUI

1. **Kompilasi Kode:**

   ```bash
   javac ToDoListSwing.java
   ```

2. **Jalankan Aplikasi:**

   ```bash
   java ToDoListSwing
   ```

## Penjelasan Kode

### `ToDoListConsole.java`

- **Data Structure:** Menggunakan `ArrayList<String>` untuk menyimpan daftar tugas.
- **Metode Utama:**
  - `showMenu()`: Menampilkan menu utama.
  - `handleCommand(String command, Scanner scanner)`: Menangani perintah pengguna.
  - `viewTasks()`: Menampilkan daftar tugas.
  - `addTask(Scanner scanner)`: Menambah tugas baru ke daftar.
  - `editTask(Scanner scanner)`: Mengedit tugas yang ada.
  - `removeTask(Scanner scanner)`: Menghapus tugas dari daftar.

### `ToDoListSwing.java`

- **Data Structure:** Menggunakan `DefaultListModel<String>` untuk mengelola daftar tugas.
- **Komponen GUI:**
  - `JFrame`: Frame utama aplikasi.
  - `JPanel`: Panel untuk menyusun komponen input dan tombol.
  - `JList`: Menampilkan daftar tugas.
  - `JTextField`: Untuk memasukkan deskripsi tugas baru.
  - `JButton`: Tombol untuk menambah, mengedit, dan menghapus tugas.
  - `JOptionPane`: Dialog untuk mengedit tugas.
- **Event Handling:**
  - `ActionListener`: Menangani aksi pada tombol.

## Kontribusi

Jika kamu ingin berkontribusi pada proyek ini, silakan fork repositori ini dan kirimkan pull request dengan perubahan yang diusulkan. Pastikan untuk menambahkan deskripsi perubahan dan menguji fungsionalitas aplikasi.


---

# Number Guessing Game

## Deskripsi

Aplikasi **Number Guessing Game** adalah permainan tebak angka sederhana yang memungkinkan pengguna menebak angka acak dalam rentang yang telah ditentukan. Proyek ini menyediakan dua versi permainan:

1. **Versi Konsol** - Menggunakan antarmuka teks di terminal untuk berinteraksi dengan pengguna.
2. **Versi GUI** - Menggunakan antarmuka grafis berbasis Java Swing.

## Fitur

- **Versi Konsol:**
  - Meminta pengguna untuk menebak angka antara 1 dan 100.
  - Memberikan umpan balik apakah tebakan terlalu rendah atau terlalu tinggi.
  - Menampilkan jumlah percobaan yang diperlukan untuk menebak angka dengan benar.

- **Versi GUI:**
  - Menyediakan antarmuka grafis dengan jendela aplikasi.
  - Meminta pengguna untuk memasukkan tebakan dan menekan tombol untuk memeriksa tebakan.
  - Menampilkan umpan balik tentang tebakan dan jumlah percobaan yang diperlukan.

## Persyaratan

- Java Development Kit (JDK) versi 8 atau yang lebih baru

## Struktur Proyek

- **`GuessNumberConsole.java`**: Implementasi game tebak angka menggunakan antarmuka konsol.
- **`GuessNumberSwing.java`**: Implementasi game tebak angka menggunakan antarmuka grafis dengan Swing.

## Cara Menjalankan

### Versi Konsol

1. **Kompilasi Kode:**

   ```bash
   javac GuessNumberConsole.java
   ```

2. **Jalankan Aplikasi:**

   ```bash
   java GuessNumberConsole
   ```

### Versi GUI

1. **Kompilasi Kode:**

   ```bash
   javac GuessNumberSwing.java
   ```

2. **Jalankan Aplikasi:**

   ```bash
   java GuessNumberSwing
   ```

## Penjelasan Kode

### `GuessNumberConsole.java`

- **Data Structure:** Menggunakan `Random` untuk memilih angka acak antara 1 dan 100.
- **Metode Utama:**
  - `main(String[] args)`: Menyediakan loop permainan di mana pengguna menebak angka dan mendapatkan umpan balik.
  - `numberToGuess`: Angka yang harus ditebak.
  - `numberOfTries`: Jumlah percobaan yang diperlukan untuk menebak angka dengan benar.

### `GuessNumberSwing.java`

- **Data Structure:** Menggunakan `DefaultListModel` dan komponen GUI Swing untuk interaksi.
- **Komponen GUI:**
  - `JFrame`: Frame utama aplikasi.
  - `JPanel`: Panel untuk menyusun komponen input dan tombol.
  - `JTextField`: Untuk memasukkan tebakan.
  - `JButton`: Tombol untuk memeriksa tebakan.
  - `JLabel`: Untuk menampilkan umpan balik kepada pengguna.
- **Event Handling:**
  - `ActionListener`: Menangani aksi pada tombol untuk memeriksa tebakan dan memberikan umpan balik.

## Kontribusi

Jika kamu ingin berkontribusi pada proyek ini, silakan fork repositori ini dan kirimkan pull request dengan perubahan yang diusulkan. Pastikan untuk menambahkan deskripsi perubahan dan menguji fungsionalitas aplikasi.

---

# Sistem Peminjaman Buku - Java (Console & GUI)

Sistem ini adalah aplikasi sederhana untuk mengelola peminjaman buku yang terdiri dari empat jenis buku: 
- Buku Referensi
- Buku Cerita / Manga / Komik
- Buku Kejuruan
- Buku Pelajaran

Aplikasi ini memiliki dua versi:
1. **Versi Console** - Berjalan di terminal.
2. **Versi GUI (Swing)** - Berjalan dengan antarmuka grafis menggunakan Swing.

## Fitur

- **Pinjam Buku:** Pengguna dapat memilih buku untuk dipinjam.
- **Kembalikan Buku:** Pengguna dapat mengembalikan buku yang telah dipinjam.
- **Cek Status Buku:** Melihat apakah buku sedang dipinjam atau tersedia.

## Persyaratan Sistem

- **Java Development Kit (JDK)** versi 8 atau lebih tinggi.
- IDE seperti **IntelliJ IDEA**, **Eclipse**, atau bisa juga menggunakan **Terminal** untuk versi Console.

## Cara Menjalankan (Versi Console)

1. Clone repository ini:
   ```bash
   git clone https://github.com/username/repo-name.git
    ```

2. cd repo-name
3. Compile and run 
  ```bash
  javac SistemPeminjamanBuku.java
  java SistemPeminjamanBuku.java
 ```

# VERSI GUI 
1. Clone repository ini:
   ```bash
   git clone https://github.com/username/repo-name.git

2.  Buka proyek di IDE seperti IntelliJ IDEA atau Eclipse
3. Jalankan file SistemPeminjamanBukuGUI.java.
4. Antarmuka GUI akan muncul, dan Anda dapat meminjam atau mengembalikan buku menggunakan tombol yang tersedia.

## Kontribusi

Jika kamu ingin berkontribusi pada proyek ini, silakan fork repositori ini dan kirimkan pull request dengan perubahan yang diusulkan. Pastikan untuk menambahkan deskripsi perubahan dan menguji fungsionalitas aplikasi.

# Simulasi Chatting - Java Swing

Ini adalah aplikasi sederhana yang mensimulasikan chatting antara pengguna dan bot. Aplikasi ini dibuat menggunakan **Java** dengan antarmuka berbasis **Swing**.

## Fitur

- Pengguna dapat mengirim pesan dan menerima balasan otomatis dari bot.
- Bot memiliki beberapa respon sederhana berdasarkan kata kunci dalam pesan.
- Antarmuka grafis yang mudah digunakan.

## Teknologi yang Digunakan

- **Java** - Bahasa pemrograman yang digunakan.
- **Swing** - Untuk membangun antarmuka grafis.

## Persyaratan Sistem

- **Java Development Kit (JDK)** versi 8 atau lebih tinggi.
- IDE seperti **IntelliJ IDEA**, **Eclipse**, atau bisa juga menggunakan **Terminal**.

## Cara Menjalankan

1. Clone repository ini:
   ```bash
   git clone https://github.com/username/repo-name.git
    ```
2. cd repo-name
3. Run the file 
  javac ChatSimulation.java
   java ChatSimulation

## Kontribusi

Jika kamu ingin berkontribusi pada proyek ini, silakan fork repositori ini dan kirimkan pull request dengan perubahan yang diusulkan. Pastikan untuk menambahkan deskripsi perubahan dan menguji fungsionalitas aplikasi.
