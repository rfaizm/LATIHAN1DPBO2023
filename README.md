# LATIHAN1DPBO2023
Latihan untuk DPBO 2023

### Saya Rachman Faiz Maulana NIM 2106791 mengerjakan Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Deskripsi Tugas
Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang menampilkan informasi daftar mahasiswa (sekumpulan objek mahasiswa) dan memiliki fitur menambah, mengubah, dan menghapus data. Setiap mahasiswa memiliki data nama, NIM, program studi, fakultas, dan foto profil (khusus bahasa PHP).

## Desain Program
Program didesain menjadi satu class : 
* **Mahasiswa**

Pada class `Mahasiswa` terdapat empat atribut:
* **nim**                -> berisikan nim mahasiswa, bertipe data `string`
* **name**               -> berisikan nama mahasiswa, tipe data `string`
* **prodi**              -> berisikan program studi mahasiswa, bertipe data `string`
* **fakultas**           -> berisikan fakultas mahasiswa, bertipe data `string`
 
Class 'Mahasiswa' terdapat 1 method : 
* **CariNim**            -> berisikan method untuk mencari nim ada atau tidak

Tiap atribut memiliki setter dan getternya masing-masing yang berada pada class `Mahasiswa`.

## Alur Program
**Semua program memiliki alur yang sama, hanya saja pada PHP tidak ada inputan dari user (data untuk CRUD dibuat hardcode).**

Di dalam list terdapat beberapa data dummy yang isinya data mahasiswa.

Pertama program akan menampilkan menu pilihan dan user diminta untuk menginput salah satu pilihan dari menu tersebut : 
Menu perintahnya yaitu:
* masukkan (1) untuk menjalankan perintah `Tambah`
Jika user menjalankan perintah ini maka program akan meminta user untuk menginputkan serangakian data mahasiswa, yaitu nama, nim, program studi dan fakultas.
Lalu setelah meninput menu 1, user akan diminta berapa jumlah data mahasiswa yang akan diinput, jika user telah menginput data mahasiswa, otomatis data list mahasiswa akan muncul.
* masukkan (2) untuk menjalankan perintah `Hapus`
Jika user menjalankan perintah/menu ini maka program akan meminta user untuk meninputkan data nim dari mahasiswa, jika nim tersebut tersedia maka data dari nim tersebut akan dihapus, jika tidak tersedia maka mengeluarkan error 'NIM Tidak ada!'
jika user telah menjalani program hapus, otomatis data list mahasiswa akan muncul
* masukkan (3) untuk menjalankan perintah 'Update'
Jika user menjalankan menu 'Update' maka program akan meminta user untuk menginputkan data nim dari mahasiswa, jika nim tersebut tersedia maka data user akan diminta untuk menginputkan; nama, prodi, fakultas.
Jika tidak tersedia nim di list maka keluar error, setelah program dijalankan maka akan menampilkan data mahasiswa

## Dokumentasi
pada program Java
![Screenshot (93)](https://user-images.githubusercontent.com/100756074/218909792-2ac2323e-4e23-4ce2-9954-1183373a12d6.png)



