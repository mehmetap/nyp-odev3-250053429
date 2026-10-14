# nyp-odev3-250053429# 
Nesne Yönelimli Programlama
 Ad Soyad: Mehmetcan Sütsatan
  Öğrenci Numarası: 250053429
  K Değeri: 29
  Repo Adı: nyp-odev3-250053429
 Proje Hakkında
Bu çalışma; Java programlama dilinde referanslar, kapsülleme, kalıtım, `super`, `protected`, metot ezme (`@Override`), `toString`, `final` anahtar kelimesi ve DRY (Don't Repeat Yourself) prensiplerini uygulamak amacıyla geliştirilmiştir.
Loncalara üye olabilen ve farklı özelliklere sahip silâhlar kuşanabilen karakterlerin yer aldığı bir simülasyon içerir.
 Sınıf Yapısı (`src/toros/`)
Lonca.java: Lonca bilgilerini ve duyuruları yönetir.
 Silah.java:Silahların hasar, dayanıklılık ve tamir süreçlerini yönetir.
 Karakter.java: Tüm karakterlerin ortak özelliklerini (ad, can, seviye, lonca, silah) barındıran temel üst sınıf.
 Savasci.java: Zırh etkisini uygulayan alt sınıf.
 Buyucu.java: Mana ve büyü işlemlerini yöneten alt sınıf.
Okcu.java: Ok sayısı ve atış mekanizmalarını yöneten alt sınıf.
 Suikastci.java: Gizlenme ve gizli saldırı yeteneklerini uygulayan alt sınıf.
 Main.java: Senaryo akışını ve geçersiz işlem kontrollerini test eder.
 Gereksinimler ve Çalıştırma
javac -encoding UTF-8 -d out src/toros/*.java
java -cp out toros.Main

