package me.phein;

public class Kreuzfahrtschiff extends Schiff {
    public Kreuzfahrtschiff(String name, String farbe) {
        super(name, 30, 100, 50, farbe, Antrieb.MOTOR, true);
    }

    @Override
    public void move() {
        System.out.println("Der Cruiser cruist!");
    }
}
