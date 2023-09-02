package com.company;

import java.util.Random;

public class System_1 {

    public static void main(String[] args) {
	    int[] numbers = new int[1000];
        Random random = new Random();

	    for(int i = 0;i < numbers.length;i++){
	        numbers[i] = random.nextInt(10000);
        }

	    int max = 0;
	    int max_2 = 0;
	    int max_7 = 0;
	    int max_14 = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            else if ((number % 2 == 0) && (number > max_2)) {
                max_2 = number;
            }
            else if ((number % 7 == 0) && (number > max_7)) {
                max_7 = number;
            }
            else if ((number % 14 == 0) && (number > max_14)) {
                max_14 = number;
            }
        }
	    int product_max = max * max_14;
	    int product_max_2 = max_2 * max_7;
	    if (product_max * product_max_2 == 0){
            System.out.println(-1);
        }
	    else{
            System.out.println(Math.max(product_max, product_max_2));
        }
    }
}
