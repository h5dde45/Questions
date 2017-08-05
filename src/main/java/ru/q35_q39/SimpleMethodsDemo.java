package ru.q35_q39;

public class SimpleMethodsDemo {
    public static void main(String[] args) {

        SimpleMethodsDemo methodsDemo=new SimpleMethodsDemo();
        methodsDemo.helloWorld();
        methodsDemo.helloWorldFrom("New");
        System.out.println(multiply(2,3));//вызов через класс
     // SimpleMethodsDemo.multiply(2,3); - тоже

    }
    //не статик на уровне  инстанса(экземпляра, объекта) класса
    private void helloWorld(){
        System.out.println("Hello world...");
    }

    private void helloWorldFrom(String str){
        System.out.println("Hello world...From "+str);
    }

    //статик на уровне  класса, одинаков(один) для всех инстансов класса
    static int multiply(int x,int y){
        return x*y;
    }

}
