# Defense Report – Tim 14 (Bila & Najwa)

## Temuan Audit
- Komposisi berlebihan di class Pc
- Redundansi method getPrice()
- Tidak semua komponen implement interface

## Perbaikan
- Peripheral dan storage diubah jadi agregasi
- Semua komponen implement Component via AbstractComponent
- getPrice() dipusatkan di AbstractComponent

## Hasil
- Desain lebih modular dan fleksibel
- Mengurangi duplikasi dan coupling
- Siap untuk ekspansi dan validasi