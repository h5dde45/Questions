package ru.q40_q44.override;

import java.io.IOException;

public class OverrideDemo extends SuperCl {

    //засширение модификатора доступа(ссужать нельзя)
    @Override
    public void drive() {
        System.out.println("...");
    }

    //ссужение исключения(нельзя расширить)
    @Override
    public void swim() throws IOException {

    }

    //удаление исключения
    @Override
    public void swim2() {
    }

    //добавление исключения - ошибка
//    @Override
//    public void swim3() throws IOException  {
//        super.swim3();
//    }

//возвращаемый тип не меняется
    @Override
    String getStr() {
        return "hello";
    }

    //аутобоксинг
    @Override
    Double getNum() {
        return 11.1;
    }

    //не переопределить private(скрытие метода суперкласса)
    public void go(){
    }

    //static не переопределить
    static void stat(){
        System.out.println("2");
    }

}
