package com.company;

import java.util.Random;

public class System_1 {

    public static void main(String[] args) {
	    int[] numbers = new int[1000];
        Random random = new Random();

        int max = 0;
        int max_2 = 0;
        int max_7 = 0;
        int max_14 = 0;

	    for(int i = 0;i < numbers.length;i++){
	        numbers[i] = random.nextInt(10000);
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if ((numbers[i] % 2 == 0) && (numbers[i] > max_2)) {
                max_2 = numbers[i];
            }
            if ((numbers[i] % 7 == 0) && (numbers[i] > max_7)) {
                max_7 = numbers[i];
            }
            if ((numbers[i] % 14 == 0) && (numbers[i] > max_14)) {
                max_14 = numbers[i];
            }
        }
	    int product_max = max * max_14;
	    int product_max_2 = max_2 * max_7;
	    if (product_max == 0 && product_max_2 == 0){
            System.out.println(-1);
        }
	    else{
            System.out.println(Math.max(product_max, product_max_2));
        }
    }
}
