package ru.q35_q39.getset;

public class GetSetDemo {
    private String name;

    public GetSetDemo() {

    }

    public GetSetDemo(String name) {

        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void privPrint(){
        System.out.println("privPrint");
    }
    protected void protPrint(){
        System.out.println("protPrint");
    }
    static void statPrint(){
        System.out.println("statPrint");
    }
}
