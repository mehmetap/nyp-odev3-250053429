public class ezme {
    public static void main(String[] args) {
        OgrenciAboneligi denizinAboneligi = new OgrenciAboneligi(
                "deniz_K", 100, "Alanya Üniversitesi");

        denizinAboneligi.ozetYazdir();
        System.out.println(denizinAboneligi.yillikUcret());
        System.out.println(denizinAboneligi.faturaBasligi());
        System.out.println(denizinAboneligi);
    }
}

class Abonelik {
    private final String kullaniciAdi;
    private final double aylikUcret;

    public Abonelik(String kullaniciAdi, double aylikUcret) {
        this.kullaniciAdi = kullaniciAdi;
        this.aylikUcret = aylikUcret;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public double getAylikUcret() {
        return aylikUcret;
    }

    public double yillikUcret() {
        return aylikUcret * 12;
    }

    public final String faturaBasligi() {
        return "FATURA - " + kullaniciAdi;
    }

    public void ozetYazdir() {
        System.out.println(kullaniciAdi + " | Aylık: "
                + aylikUcret + " TL");
    }
}

class OgrenciAboneligi extends Abonelik {
    private final String okulAdi;

    public OgrenciAboneligi(
            String kullaniciAdi, double aylikUcret, String okulAdi) {
        super(kullaniciAdi, aylikUcret);
        this.okulAdi = okulAdi;
    }

    @Override
    public double yillikUcret() {
        return super.yillikUcret() * 0.5;
    }

    @Override
    public void ozetYazdir() {
        super.ozetYazdir();
        System.out.println("Okul: " + okulAdi
                + " | Yıllık: " + yillikUcret() + " TL");
    }


    @Override
    public String toString() {
        return "OgrenciAboneligi[kullaniciAdi=" + getKullaniciAdi()
                + ", okulAdi=" + okulAdi + "]";
    }
}
