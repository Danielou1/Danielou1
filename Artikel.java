public class Artikel {
    private int artikeNummer;
    private double einkaufPreis;
    private String namen;
    private int regalNummer;

    public Artikel(int artikeNummer, double einkaufPreis, String namen, int regalNummer) {
        this.artikeNummer = artikeNummer;
        this.einkaufPreis = einkaufPreis;
        this.namen = namen;
        this.regalNummer = regalNummer;
    }

    public double mehrwertSteuer(){
        return einkaufPreis * 19/100 + einkaufPreis;
    }

    public int getArtikeNummer() {
        return artikeNummer;
    }

    public void setArtikeNummer(int artikeNummer) {
        this.artikeNummer = artikeNummer;
    }

    public double getEinkaufPreis() {
        return einkaufPreis;
    }

    public void setEinkaufPreis(double einkaufPreis) {
        this.einkaufPreis = einkaufPreis;
    }

    public String getNamen() {
        return namen;
    }

    public void setNamen(String namen) {
        this.namen = namen;
    }

    public int getRegalNummer() {
        return regalNummer;
    }

    public void setRegalNummer(int regalNummer) {
        this.regalNummer = regalNummer;
    }

    @Override
    public String toString() {
        return " ArtikelNummer: "+artikeNummer+" EinkaufPreis: "+einkaufPreis+ " Name: " + namen + ", regalNummer: " + regalNummer + "\t";
    }



    


    

}
