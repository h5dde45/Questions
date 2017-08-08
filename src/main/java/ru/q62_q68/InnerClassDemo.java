package ru.q62_q68;

public class InnerClassDemo {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.test();
        System.out.println("===============");

        outer.test2();
        System.out.println("===============");

        Outer.Inner inner = new Outer().new Inner();
        inner.display();
        System.out.println("===============");

    }
}

//внешний класс
class Outer {
    int outer_var = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    //внутренний класс
    class Inner {
        int unner_var = 200;

         void display() {
            System.out.println("Class Inner=> " + outer_var);
        }
    }

    void test2() {
        for(int i=0;i<3;i++){
            //локальный внутренний класс (внутри кода)
            class Inner2{
                void display2() {
                    System.out.println("Class Inner2=> " + outer_var);
                }
            }
            Inner2 inner2=new Inner2();
            inner2.display2();
        }

    }
}
