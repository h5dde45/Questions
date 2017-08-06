package ru.q336.d2;

public enum Day implements Runnable {
    SUNDAY(7,"good day"),
    MONDAY(1,"hard"),
    TUESDAY(2,"work"),
    WEDNESDAY(3,"work"),
    THURSDAY(4,"work"),
    FRIDAY(5,"short day"),
    SATURDAY(6,"rest");

    private int order;
    private String destr;

    Day(int order, String destr) {
        this.order = order;
        this.destr = destr;
    }

    @Override
    public String toString() {
        return "Day{" +
                "order=" + order +
                ", destr='" + destr + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println("name = "+name()+" toString "+toString());
    }
}
