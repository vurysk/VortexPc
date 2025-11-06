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

## Personal Reflection

### Nabila Firda Suryani (3124600104)

1. **Momen “Aha!” Terbesar**  
Selama praktikum ini, saya baru benar-benar menyadari bahwa mata kuliah OOP tidak sesederhana praktik biasa yang pernah saya lakukan. Ketika dihadapkan pada studi kasus nyata seperti ini, semuanya terasa jauh lebih rumit dan menantang. Apalagi dengan tekanan waktu, saya merasa logika saya benar-benar dipaksa bekerja keras. Game ini membuat saya sadar bahwa merancang sistem yang fleksibel, bersih secara struktur (clean code), dan dibangun dari nol bukanlah hal yang mudah. Dibutuhkan pemahaman desain yang matang, ketenangan dalam berpikir, dan kemampuan untuk menyeimbangkan antara fungsionalitas dan struktur — dan semua itu tidak bisa dilakukan secara terburu-buru.

2. **Kelemahan Terbesar Saya/Tim**  
Saat menjadi Blue Team, serangan yang paling tidak kami antisipasi adalah ketika Red Team menyoroti ketergantungan antar komponen yang terlalu kuat. Kami kurang memperhatikan prinsip pemisahan tanggung jawab dan abstraksi sejak awal, sehingga beberapa bagian sistem menjadi terlalu terikat satu sama lain. Kelemahan ini muncul karena fokus awal kami lebih pada fungsionalitas dan showcase, bukan pada desain yang scalable dan defensif.

3. **Skill Baru Paling Berharga**  
Skill paling berharga yang saya pelajari hari ini adalah kemampuan melakukan refactoring manual dan audit kode secara sistematis. Saya jadi lebih peka terhadap code smell seperti Feature Envy dan mulai memahami bagaimana memindahkan method ke class yang lebih tepat. Kemampuan ini sangat relevan untuk dunia kerja, karena kualitas sistem tidak hanya diukur dari fungsinya, tetapi juga dari kemudahan pemeliharaan dan pengembangannya di masa depan.

