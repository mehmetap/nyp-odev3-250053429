public class Kupa {
    private String renk;
    private final int hacimMl;
    public Kupa(String renk, int hacimMl) {
        this.renk = renk;
        this.hacimMl = hacimMl;
    }
    public void boya(String yeniRenk) {
        renk = yeniRenk;
    }
    public String getRenk() {
        return renk;
    }
    public int getHacimMl() {
        return hacimMl;
    }
}
