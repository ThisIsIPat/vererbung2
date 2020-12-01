package me.phein;

public class Main {
    public static void main(String[] args) {
        Schiff kanu1 = new Kanu("Columbus", 2);
        Schiff kanu2 = new Kanu("Sven", "rot", 1);
        Kanu kanu3 = new Kanu("Titanic", "weiss", 4);

        Kanu fixedKanu2 = (Kanu) kanu2;
        kanu2.setName("Marine");
	    System.out.println(kanu2.toString());

	    System.out.println(fixedKanu2.getSitzPlaetze());
    }
}
