package com.company;

import java.util.Random;

public class System_2 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        Random random = new Random();

        int min = 10001;
        int min_3 = 10001;
        int min_7 = 10001;
        int min_21 = 10001;

        for(int i = 0;i < numbers.length;i++){
            numbers[i] = random.nextInt(10000);
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if ((numbers[i] % 3 == 0) && (numbers[i] < min_3)) {
                min_3 = numbers[i];
            }
            if ((numbers[i] % 7 == 0) && (numbers[i] < min_7)) {
                min_7 = numbers[i];
            }
            if ((numbers[i] % 21 == 0) && (numbers[i] < min_21)) {
                min_21 = numbers[i];
            }
        }

        int product_min = 0;
        int product_min_2 = 0;

        System.out.println(min);
        System.out.println(min_3);
        System.out.println(min_7);
        System.out.println(min_21);


        if(min != 10001 && min_21 != 10001){
            product_min = min * min_21;
        }

        if(min_3 != 10001 && min_7 != 10001){
            product_min_2 = min_3 * min_7;
        }


        if (product_min == 0 && product_min_2 == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(Math.max(product_min, product_min_2));
        }
    }
}
