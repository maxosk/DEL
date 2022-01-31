package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class InTrend {

    public static void main(String[] args) {
        int temp = 0;
        for (int i = 1000; i < 10000; i++) {
            if (i % 2 == 0 && ((i / 1000) % 10) % 2 == 0 && ((i / 100) % 10) % 2 == 0 && ((i / 10) % 10) % 2 == 0 && (i % 10) % 2 == 0) {
                temp++;
            }

        }
        System.out.println(temp);
    }


}






      /*  return "... To Do... Lucky";
		else return "Unlucky";*/


