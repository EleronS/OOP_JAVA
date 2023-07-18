package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] unsorted = {3, 5, 9, 2, 4};

        int[] sorted = sort(unsorted);

        Arrays.sort(sorted);

        System.out.println("Array sorted: " + Arrays.toString(sorted));
    }



        static class HeapItem {
            public int value;
            public HeapItem left;
            public HeapItem right;

            public HeapItem(int i, Object o, Object o1) {
            }

            @Override
            public String toString() {
                return String.format("HeapItem[%d, %s, %s]", value, left, right);
            }

            void swapWith(HeapItem other) {
                if (left != null) {
                    left.swapWith(other.left);
                }

                if (right != null) {
                    right.swapWith(other.right);
                }
            }
        }

        static int[] sort(int[] unsorted) {
            HeapItem[] heap = new HeapItem[unsorted.length];

            for (int i = unsorted.length - 1; i >= 0; i--) {
                heap[i] = new HeapItem(unsorted[i], null, null);
            }

            for (HeapItem item : heap) {
                System.out.print(item.value + " ");
            }

            System.out.println();

            return unsorted;
        }

}