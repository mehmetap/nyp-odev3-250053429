package toros;

public class Main {
    public static void main(String[] args) {
        final int kisiselDeger = 29;

        // 1. İki lonca
        Lonca kartalLoncasi = new Lonca(
                "Kartal Loncası",
                1071,
                "Cuma akşamı kale kuşatması!");

        Lonca torosLoncasi = new Lonca(
                "Toros Loncası",
                2026,
                "Dağ geçitlerini koruyun!");

        // 2. Üç karakter
        Savasci kaleMuhafizi = new Savasci(
                "Ayşe", kartalLoncasi, kisiselDeger % 31);

        Buyucu atesBuyucusu = new Buyucu(
                "Deniz", kartalLoncasi);

        Okcu dagGozcusu = new Okcu(
                "Efe", torosLoncasi);

        // 3. Silahlar
        Silah muhafizKilici = new Silah(
                "Kılıç", Math.max(10, kisiselDeger));

        Silah gozcuYayi = new Silah("Yay", 12);

        kaleMuhafizi.silahKusan(muhafizKilici);
        dagGozcusu.silahKusan(gozcuYayi);

        // 4. Başlangıç bilgileri
        System.out.println("=== Başlangıç ===");
        kaleMuhafizi.bilgiGoster();
        atesBuyucusu.bilgiGoster();
        dagGozcusu.bilgiGoster();

        // 5. Üç savaşçı saldırısı
        System.out.println("\n=== Savaşçı saldırıları ===");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Saldırı " + i
                    + ": " + kaleMuhafizi.saldir());
        }

        System.out.println("Kılıç dayanıklılığı: "
                + muhafizKilici.getDayaniklilik());

        // 6. Zırh karşılaştırması
        System.out.println("\n=== Zırh karşılaştırması ===");

        kaleMuhafizi.hasarAl(40);
        atesBuyucusu.hasarAl(40);

        System.out.println("Savaşçı canı: " + kaleMuhafizi.getCan());
        System.out.println("Büyücü canı: " + atesBuyucusu.getCan());

        // 7. İki başarılı ve bir başarısız büyü
        System.out.println("\n=== Büyüler ===");

        System.out.println("Birinci büyü hasarı: "
                + atesBuyucusu.buyuYap("Ateş Topu", 30));

        System.out.println("İkinci büyü hasarı: "
                + atesBuyucusu.buyuYap("Buz Oku", 30));

        try {
            atesBuyucusu.buyuYap("Fırtına", 50);
        } catch (IllegalStateException hata) {
            System.out.println("Üçüncü büyü reddedildi: "
                    + hata.getMessage());
        }

        System.out.println("Kalan mana: " + atesBuyucusu.getMana());

        // 8. İki okçu atışı
        System.out.println("\n=== Okçu ===");

        System.out.println("Birinci atış hasarı: "
                + dagGozcusu.atesEt());

        System.out.println("İkinci atış hasarı: "
                + dagGozcusu.atesEt());

        System.out.println("Kalan ok: " + dagGozcusu.getOkSayisi());

        // 9. İyileşme ve seviye atlama
        System.out.println("\n=== İyileşme ve seviye ===");

        atesBuyucusu.iyiles(20);

        System.out.println("İyileşme sonrası can: "
                + atesBuyucusu.getCan());

        atesBuyucusu.seviyeAtla();
        atesBuyucusu.bilgiGoster();

        // 10. Geçersiz işlemler
        System.out.println("\n=== Geçersiz işlemler ===");

        try {
            new Karakter("Al", kartalLoncasi);
        } catch (IllegalArgumentException hata) {
            System.out.println("Ad hatası: " + hata.getMessage());
        }

        try {
            kaleMuhafizi.hasarAl(-5);
        } catch (IllegalArgumentException hata) {
            System.out.println("Hasar hatası: " + hata.getMessage());
        }

        try {
            atesBuyucusu.iyiles(0);
        } catch (IllegalArgumentException hata) {
            System.out.println("İyileşme hatası: " + hata.getMessage());
        }

        // 11. Ortak lonca duyurusunun değişmesi
        System.out.println("\n=== Ortak lonca duyurusu ===");

        kartalLoncasi.duyuruDegistir("Pazar sabahı eğitim var!");

        kaleMuhafizi.bilgiGoster();
        atesBuyucusu.bilgiGoster();

        // 12. toString
        System.out.println("\n=== toString ===");
        System.out.println(dagGozcusu);
    }
}