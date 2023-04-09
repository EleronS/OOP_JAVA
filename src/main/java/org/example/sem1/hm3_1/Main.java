package org.example.sem1.hm3_1;

public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        for ( int i = 0; i < 5; i++ ) {
            if(i%2 == 0){
                tea.addDrink(new HotTea("tea"+i,i*0.1,i*10));
            }
            else{
                tea.addDrink(new HotTea("coffee"+i,i*0.2,i*15));
            }


        }
        Tea.print();
    }
}
