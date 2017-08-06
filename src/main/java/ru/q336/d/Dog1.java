package ru.q336.d;

public enum Dog1 {
    BOXER(35),
    PUDEL(10),
    PITBUL(30),
    LABRADOR,
    PIKINES;

    private int weigth;

    Dog1() {
        weigth = 20;
    }

    Dog1(int weigth) {
        this.weigth = weigth;
    }

    public int getWeigth() {
        return weigth;
    }
}
