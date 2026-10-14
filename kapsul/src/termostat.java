class Termostat {
    private static final double MIN_SICAKLIK = 16.0;
    private static final double MAX_SICAKLIK = 30.0;
    private static final double SICAKLIK_ADIMI = 0.5;

    private final String odaAdi;
    private double hedefSicaklik = 20.0;
    private boolean acik;

    public Termostat(String odaAdi) {
        if (odaAdi == null || odaAdi.isBlank()) {
            throw new IllegalArgumentException("Oda adı boş olamaz.");
        }
        this.odaAdi = odaAdi;
    }

    public String getOdaAdi() {
        return odaAdi;
    }

    public double getHedefSicaklik() {
        return hedefSicaklik;
    }

    public boolean isAcik() {
        return acik;
    }

    public void ac() {
        acik = true;
    }

    public void kapat() {
        acik = false;
    }

    public void sicaklikArtir() {
        sicakligiDegistirebilirMi();
        if (hedefSicaklik + SICAKLIK_ADIMI > MAX_SICAKLIK) {
            throw new IllegalStateException(
                    "Hedef sıcaklık 30 dereceyi aşamaz.");
        }
        hedefSicaklik += SICAKLIK_ADIMI;
    }

    public void sicaklikAzalt() {
        sicakligiDegistirebilirMi();
        if (hedefSicaklik - SICAKLIK_ADIMI < MIN_SICAKLIK) {
            throw new IllegalStateException(
                    "Hedef sıcaklık 16 derecenin altına inemez.");
        }
        hedefSicaklik -= SICAKLIK_ADIMI;
    }

    private void sicakligiDegistirebilirMi() {
        if (!acik) {
            throw new IllegalStateException(
                    "Kapalı termostatın sıcaklığı değiştirilemez.");
        }
    }
}