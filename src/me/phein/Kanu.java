package me.phein;

public class Kanu extends Schiff {
    private int sitzPlaetze;

    public Kanu(String name, String farbe, int sitzPlaetze) {
        super(name, 0.5, 2, 0.5, farbe, "Paddel", false);
        this.sitzPlaetze = sitzPlaetze;
    }

    public Kanu(String name, int sitzPlaetze) {
        this(name, "braun", sitzPlaetze);
    }

    public int getSitzPlaetze() {
        return sitzPlaetze;
    }

    public int getSitzPlaetze(boolean minus1) {
        if (minus1) {
            return sitzPlaetze - 1;
        } else {
            return sitzPlaetze;
        }
    }

    @Override
    public String toString() {
        return "Kanu{" +
                "sitzPlaetze=" + sitzPlaetze +
                '}' + " und es erbt von " + super.toString();
    }
}
