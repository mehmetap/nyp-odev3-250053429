package toros;

public class Okcu extends Karakter {
    private int okSayisi;
    public Okcu(String ad, Lonca lonca) {
        super(ad, lonca);
        okSayisi = 30;
    }
    public int getOkSayisi() {
        return okSayisi;
    }
    public int atesEt() {
        hayattaOldugunuDogrula();
        if (okSayisi == 0) {
            throw new IllegalStateException("Ok kalmadı.");
        }
        int saldiriHasari = saldir() + 3;
        okSayisi--;
        kayitYaz("ok attı");
        return saldiriHasari;
    }
    public void okTopla(int adet) {
        hayattaOldugunuDogrula();
        if (adet <= 0) {
            throw new IllegalArgumentException("Ok adedi pozitif olmalı.");
        }
        okSayisi += Math.min(adet, 60 - okSayisi);
    }
    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("  Ok: " + okSayisi + "/60");
    }
    @Override
    public String toString() {
        return "Okcu[" + getAd()
                + ", seviye " + getSeviye()
                + ", ok " + okSayisi + "]";
    }
}