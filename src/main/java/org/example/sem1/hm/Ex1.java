package org.example.sem1.hm;
/*Создать наследника реализованного класса ГорячийНапиток с дополнительным полем
int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
 перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
 соответствующий имени, объему и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре*/

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {

    HotDrinksMachine machine = new HotDrinksMachine();
    machine.addDrink(new HotTea("ice tea",0.2,22));
    machine.addDrink(new HotTea("cold tea",0.4,23));
    machine.addDrink(new HotTea("nice tea",0.3,24));
    machine.addDrink(new HotTea("hot tea",0.2,25));

        ArrayList list1 = machine.getProduct(25);
        System.out.println(list1);

        ArrayList list2 = machine.getProduct(0.2);
        System.out.println(list2);

        ArrayList list3 = machine.getProduct("tea");
        System.out.print(list3);

    }
}
