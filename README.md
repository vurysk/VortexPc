# VortexPC - Core Engine v1.0

## Tim
- Nabila Firda Suryani(3124600104)
- Najwa Az Zahra Putri(3124600111)

## Deskripsi Arsitektur
Arsitektur kami menggunakan interface `Component` dan superclass `AbstractComponent` untuk menyatukan semua komponen PC secara fleksibel. Komponen storage dan peripheral diimplementasikan sebagai agregasi, sehingga dapat ditambahkan secara dinamis tanpa mengubah struktur class `Pc`. Kami juga telah memperbaiki code smell seperti Feature Envy dan redundansi method, sehingga sistem lebih modular, maintainable, dan siap untuk ekspansi di masa depan.

## Showcase
Demo dilakukan melalui file `Main.java`, yang menampilkan proses perakitan PC lengkap dengan komponen inti dan periferal. Output mencakup ringkasan build dan total harga akhir, ditampilkan dengan format yang rapi dan sesuai instruksi Misi 4.

Contoh output:
--- PC Build by Team 14 "Bila & Jua" ---
CPU: Intel Core i9-13900K
Motherboard: ASUS ROG Maximus Z790
RAM: Corsair Vengeance 16GB x2
Storage: Samsung 980 Pro 1TB
Peripheral: Logitech G Pro X, Keychron K6, LG UltraGear 27", Edifier R1700BT
Final Price: Rp 5,750,000 --- Build Successful! ---



## Cara Menjalankan
1. Buka terminal dan arahkan ke folder `vortexpc`.
2. Compile semua file:
javac Main.java Tes.java model/*.java components/*.java components/core/*.java components/storage/*.java components/peripheral/*.java
3. Jalankan showcase:
java vortexpc.Main


## Status
Final build telah diuji dan lolos regression testing. Showcase berhasil dijalankan tanpa error. Proyek siap dirilis dan dikumpulkan sesuai instruksi Misi 4.


