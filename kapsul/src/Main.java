public class Main {
    public static void main(String[] args) {
        Termostat termostat = new Termostat("Çalışma odası");
        termostat.ac();
        termostat.sicaklikArtir();
        System.out.println(termostat.getOdaAdi() + ": " + termostat.getHedefSicaklik());
        termostat.kapat();
    }
}
