package me.phein;

public class Main {
    public static void main(String[] args) {
        Schiff schiff1 = new Kanu("Columbus", 2);
        Schiff schiff2 = new Kanu("Sven", "rot", 1);
        Schiff schiff3 = new Kanu("Titanic", "weiss", 4);
        Schiff schiff4 = new Kreuzfahrtschiff("Wings", "gold");

	    schiff3.move();
	    schiff4.swim();
    }
}
