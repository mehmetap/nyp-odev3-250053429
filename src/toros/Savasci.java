package toros;

public class Savasci extends Karakter {
    private final int zirhYuzdesi;

    public Savasci(String ad, Lonca lonca, int zirhYuzdesi) {
        super(ad, lonca);
        if (zirhYuzdesi < 0 || zirhYuzdesi > 100) {
            throw new IllegalArgumentException(
                    "Zırh yüzdesi 0–100 arasında olmalı.");
        }
        this.zirhYuzdesi = zirhYuzdesi;
    }

    public int getZirhYuzdesi() {
        return zirhYuzdesi;
    }

    @Override
    public void hasarAl(int miktar) {
        if (miktar <= 0) {
            throw new IllegalArgumentException(
                    "Hasar miktarı pozitif olmalı.");
        }

        int alinanHasar = miktar
                - (int) ((long) miktar * zirhYuzdesi / 100);
        if (alinanHasar > 0) {
            super.hasarAl(alinanHasar);
        }
    }

    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("  Zırh: %" + zirhYuzdesi);
    }

    @Override
    public String toString() {
        return "Savasci[" + getAd()
                + ", seviye " + getSeviye()
                + ", zırh %" + zirhYuzdesi + "]";
    }
}
