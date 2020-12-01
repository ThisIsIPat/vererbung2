package me.phein;

public class Schiff {
    private String name;
    private double hoeheInM;
    private double laengeInM;
    private double breiteInM;
    private String farbe;
    private String antrieb;
    private boolean kommerziell;

    public Schiff(String name, double hoeheInM, double laengeInM,
                  double breiteInM, String farbe, String antrieb, boolean kommerziell) {
        this.name = name;
        this.hoeheInM = hoeheInM;
        this.laengeInM = laengeInM;
        this.breiteInM = breiteInM;
        this.farbe = farbe;
        this.antrieb = antrieb;
        this.kommerziell = kommerziell;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getHoeheInM() {
        return hoeheInM;
    }
    public double getLaengeInM() {
        return laengeInM;
    }
    public double getBreiteInM() {
        return breiteInM;
    }
    public String getFarbe() {
        return farbe;
    }
    public String getAntrieb() {
        return antrieb;
    }
    public boolean isKommerziell() {
        return kommerziell;
    }

    @Override
    public String toString() {
        return "Schiff{" +
                "name='" + name + '\'' +
                ", hoeheInM=" + hoeheInM +
                ", laengeInM=" + laengeInM +
                ", breiteInM=" + breiteInM +
                ", farbe='" + farbe + '\'' +
                ", antrieb='" + antrieb + '\'' +
                ", kommerziell=" + kommerziell +
                '}' + " und die Adresse ist " + super.toString();
    }
}
