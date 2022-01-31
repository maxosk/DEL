package com.company;

public class Palindrome {

    public static void main(String[] args){


        int count=0;
        //также можно до середины дойти и умножить на 2
        for (int i=10000;i<100000;i++){
            if ((i/10000==i% 10000 % 1000 % 100 % 10)&&(i/1000%10==i% 10000 % 1000 % 100 / 10)){
                count++;
            }
        }
        System.out.println(count);




    }

}
