package ru.q35_q39.overload;

import java.util.List;

public class OverloadDemo1 {

//перегрузка методов (изменения параметров сигнатуры методов)
    public void doSmth(){}
    void doSmth(int i){} //модификатор доступа не важен
    public void doSmth(String s){}
    public void doSmth(String s,int i){}
    public void doSmth(String s,int i,double d)throws Exception{} //тоже с исключением
    public void doSmth(int i,String s,double d)throws Exception{} //изменен порядок параметров
    protected Object doSmth(Object o){return null;} //тоже с другим ретурном и  мод. дост.
    static int doSmth(List list){return 33;} // тоже со статиком

    public static void test(int[] nums){}
//    public static void test(int... nums){} // на этапе компиляции вараргс преобразуется в массив

    public static void main(String[] args) {
        test(new int[]{1,2});
//        test(1,2,3);
//        test();
    }
}
