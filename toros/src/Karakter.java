package toros;

public class Karakter {
    private final String ad;
    private int seviye;
    private int can;
    private final Lonca lonca;
    private Silah silah;

    public Karakter(String ad, Lonca lonca) {
        if (ad == null || ad.isBlank()
                || ad.length() < 3 || ad.length() > 15) {
            throw new IllegalArgumentException(
                    "Karakter adı 3–15 karakter olmalı.");
        }
        if (lonca == null) {
            throw new IllegalArgumentException("Lonca null olamaz.");
        }
        this.ad = ad;
        this.lonca = lonca;
        seviye = 1;
        can = azamiCan();
        silah = null;
    }

    public String getAd() {
        return ad;
    }

    public int getSeviye() {
        return seviye;
    }

    public int getCan() {
        return can;
    }

    public final int azamiCan() {
        return 100 + seviye * 10;
    }

    public final boolean hayattaMi() {
        return can > 0;
    }

    protected void hayattaOldugunuDogrula() {
        if (!hayattaMi()) {
            throw new IllegalStateException("Karakter hayatta değil.");
        }
    }

    protected void kayitYaz(String olay) {
        System.out.println("[" + ad + "] " + olay);
    }

    public void hasarAl(int miktar) {
        if (miktar <= 0) {
            throw new IllegalArgumentException(
                    "Hasar miktarı pozitif olmalı.");
        }
        can = Math.max(0, can - miktar);
    }

    public void iyiles(int miktar) {
        if (miktar <= 0) {
            throw new IllegalArgumentException(
                    "İyileşme miktarı pozitif olmalı.");
        }
        hayattaOldugunuDogrula();
        can += Math.min(miktar, azamiCan() - can);
    }

    public void seviyeAtla() {
        hayattaOldugunuDogrula();
        if (seviye == 50) {
            throw new IllegalStateException("Seviye en fazla 50 olabilir.");
        }
        seviye++;
        can = azamiCan();
    }

    public void silahKusan(Silah yeniSilah) {
        hayattaOldugunuDogrula();
        if (yeniSilah == null) {
            throw new IllegalArgumentException("Silah null olamaz.");
        }
        silah = yeniSilah;
    }

    public int saldir() {
        hayattaOldugunuDogrula();
        if (silah == null) {
            return 5 + seviye;
        }
        return silah.kullan() + seviye;
    }

    public void bilgiGoster() {
        String silahBilgisi =
                silah == null ? "yok" : silah.bilgiMetni();
        System.out.println(ad + " | Seviye " + seviye
                + " | Can " + can + "/" + azamiCan()
                + " | Lonca: " + lonca.getAd()
                + " | Silah: " + silahBilgisi);
        System.out.println("  " + lonca.bilgiMetni());
    }

    @Override
    public String toString() {
        return "Karakter[" + ad + ", seviye " + seviye + "]";
    }
}
