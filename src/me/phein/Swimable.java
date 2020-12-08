package me.phein;

public interface Swimable {
    void swim();

    default void makeSound() {
        System.out.println("Surr.");
    }
}
