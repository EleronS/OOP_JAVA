package org.example.bin_tree;

import java.util.Random;

public class Main {
    public static void main(String[] args){

        BinTree<Integer> tree = new BinTree<>();

        for(int i = 0; i < 10; i++){
            int r = new Random().nextInt(20);
            tree.add(new Random().nextInt(20));
            System.out.print(r + " ");
        }

    }
}
