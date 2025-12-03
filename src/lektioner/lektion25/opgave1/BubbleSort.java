package lektioner.lektion25.opgave1;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        String[] navne = {"Erna", "Elly", "Laurits", "Bertha", "Christian",
                "August", "Marius", "John", "Tove", "Poul", "Torkild"};

        System.out.println(Arrays.toString(navne));

        bubbleSort(navne);

        System.out.println(Arrays.toString(navne));
    }

    private static void swap() {

    }


//    public static void bubbleSort2(String[] list) {
    //        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list.length - 2; j++) {
//                if (list[j].compareTo(list[i]))
//            }
//        }
//    }


    public static void bubbleSort(String[] array) {

        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }

            }
        }
    }


}
