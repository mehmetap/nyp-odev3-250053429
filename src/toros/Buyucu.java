package toros;

public class Buyucu extends Karakter {
    private int mana;

    public Buyucu(String ad, Lonca lonca) {
        super(ad, lonca);
        mana = 100;
    }

    public int getMana() {
        return mana;
    }

    public int buyuYap(String buyuAdi, int manaMaliyeti) {
        hayattaOldugunuDogrula();

        if (buyuAdi == null || buyuAdi.isBlank()) {
            throw new IllegalArgumentException("Büyü adı boş olamaz.");
        }

        if (manaMaliyeti < 1 || manaMaliyeti > 50) {
            throw new IllegalArgumentException(
                    "Mana maliyeti 1–50 arasında olmalı.");
        }

        if (mana < manaMaliyeti) {
            throw new IllegalStateException("Yetersiz mana.");
        }

        mana -= manaMaliyeti;
        kayitYaz(buyuAdi + " büyüsü yaptı");

        return manaMaliyeti * 2 + getSeviye();
    }

    public void manaTopla(int miktar) {
        hayattaOldugunuDogrula();

        if (miktar <= 0) {
            throw new IllegalArgumentException(
                    "Mana miktarı pozitif olmalı.");
        }

        mana += Math.min(miktar, 100 - mana);
    }

    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("  Mana: " + mana + "/100");
    }

    @Override
    public String toString() {
        return "Buyucu[" + getAd()
                + ", seviye " + getSeviye()
                + ", mana " + mana + "]";
    }
}