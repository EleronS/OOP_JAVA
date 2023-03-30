package org.example.sem2.hw1;

import java.util.ArrayList;
import java.util.List;

public class DataBaseProduct extends Product implements DataSorted {
    public DataBaseProduct(String name, Integer price, String grade) {
        super(name, price, grade);

        Product product1 = new Product("высший уровень", 515, "third");
        Product product2 = new Product("Наивысший", 1122, "first");
        Product product3 = new Product("Вообще не але", 38, "second");
        Product product4 = new Product("Самый высший", 1111, "second");
        Product product5 = new Product("Такое себе...", 87, "first");
        Product product6 = new Product("Всевышний!", 390, "first");

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);


        String hight = "высший";
        String f1 = "first";
        String s2 = "second";
        int maxPrice = 0;

        for ( Product product : productList ) {
            if (product.getGrade().contains(f1) || product.getGrade().contains(s2)) {
                if (product.getName().contains(hight)) {
                    if (product.getPrice() > maxPrice) {
                        maxPrice = 0;
                        maxPrice += product.getPrice().intValue();
                    }
                }
            }
        }
        System.out.println("Наибольшая цена: = " + maxPrice);


}




    @Override
    public int DataMaxPriceSorted(List productList) {
        return 0;
    }

    @Override
    public void DataMaxPriceSorted() {

    }

}
