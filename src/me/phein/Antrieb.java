package me.phein;

public enum Antrieb {
    SEGEL(false),
    PADDEL(false),
    MOTOR(true),
    NUKLEAR(true);

    private final boolean mechanisch;
    Antrieb(boolean mechanisch) {
        this.mechanisch = mechanisch;
    }

    public boolean isMechanisch() {
        return mechanisch;
    }

    @Override
    public String toString() {
        return "Antrieb." + this.name() + '{' +
                "mechanisch=" + mechanisch +
                '}';
    }
}
