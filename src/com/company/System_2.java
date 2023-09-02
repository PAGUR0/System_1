package com.company;

import java.util.Random;

public class System_2 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        Random random = new Random();

        int min = numbers[0];
        int min_3 = numbers[0];
        int min_7 = numbers[0];
        int min_21 = numbers[0];

        for(int i = 0;i < numbers.length;i++){
            numbers[i] = random.nextInt(10000);
            if (numbers[i] < min) {
                min = numbers[i];
            }
            else if (numbers[](numbers[i] % 2 == 0) && (numbers[i] < min_3)) {
                min_3 = numbers[i];
            }
            else if ((numbers[i] % 7 == 0) && (numbers[i] < min_7)) {
                min_7 = numbers[i];
            }
            else if ((numbers[i] % 14 == 0) && (numbers[i] < min_21)) {
                min_21 = numbers[i];
            }
        }
        int product_min = min * min_21;
        int product_min_2 = min_3 * min_7;
        if (product_min == 0 && product_min_2 == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(Math.max(product_min, product_min_2));
        }
    }
}
