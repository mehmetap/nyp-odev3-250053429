package toros;

public class Lonca {
    private final String ad;
    private final int kurulusYili;
    private String duyuru;

    public Lonca(String ad, int kurulusYili, String duyuru) {
        if (ad == null || ad.isBlank()
                || ad.length() < 3 || ad.length() > 25) {
            throw new IllegalArgumentException(
                    "Lonca adı 3–25 karakter olmalı.");
        }
        if (kurulusYili <= 0) {
            throw new IllegalArgumentException(
                    "Kuruluş yılı pozitif olmalı.");
        }
        this.ad = ad;
        this.kurulusYili = kurulusYili;
        duyuruDegistir(duyuru);
    }

    public String getAd() {
        return ad;
    }

    public void duyuruDegistir(String yeniDuyuru) {
        if (yeniDuyuru == null || yeniDuyuru.isBlank()
                || yeniDuyuru.length() > 100) {
            throw new IllegalArgumentException(
                    "Duyuru boş olamaz ve 100 karakteri geçemez.");
        }
        duyuru = yeniDuyuru;
    }

    public String bilgiMetni() {
        return ad + " (kuruluş " + kurulusYili
                + ") - Duyuru: " + duyuru;
    }
}
