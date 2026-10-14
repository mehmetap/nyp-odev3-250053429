package toros;

public class Suikastci extends Karakter {
    private boolean gizli;

    public Suikastci(String ad, Lonca lonca) {
        super(ad, lonca);
        gizli = false;
    }

    public void gizlen() {
        hayattaOldugunuDogrula();
        gizli = true;
        kayitYaz("gölgelere karıştı");
    }

    @Override
    public int saldir() {
        int normalHasar = super.saldir();

        if (gizli) {
            gizli = false;
            return normalHasar * 2;
        }

        return normalHasar;
    }

    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("  Gizli: " + gizli);
    }

    @Override
    public String toString() {
        return "Suikastci[" + getAd()
                + ", seviye " + getSeviye()
                + ", gizli " + gizli + "]";
    }
}