class Cihaz {
    private final String ad;

    Cihaz(String ad) {
        this.ad = ad;
        System.out.println("1) Cihaz kuruldu: " + ad);
    }

    String getAd() {
        return ad;
    }
}

class Bilgisayar extends Cihaz {
    private final int ramGb;

    Bilgisayar(String ad, int ramGb) {
        super(ad);
        this.ramGb = ramGb;
        System.out.println("2) Bilgisayar kuruldu: " + ramGb + " GB");
    }

    int getRamGb() {
        return ramGb;
    }
}

class DizustuBilgisayar extends Bilgisayar {
    DizustuBilgisayar(int ekranInc) {
        super("Laptop-29", 16);
        System.out.println("3) Dizüstü kuruldu: " + ekranInc + " inç");
    }
}

class Tablet extends Cihaz {
    Tablet() {
        super("Tablet");
        System.out.println("Tablet kuruldu");
    }
}

public class Main {
    public static void main(String[] args) {
        DizustuBilgisayar ofisLaptopu = new DizustuBilgisayar(14);

        System.out.println("Laptop adı: " + ofisLaptopu.getAd());
        System.out.println("Laptop RAM: " + ofisLaptopu.getRamGb() + " GB");

        System.out.println();
        new Tablet();
    }
}
