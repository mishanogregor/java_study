package com.javarush.task.pro.task05.task0523;

/* 
Охота на Кибердракона
*/

public class Solution {
    public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int x=0;
        int y=0;
        for (int i=1; i<11; i++)
        if (i%2==0){
            y=y+i;
        }
        else {
            x=x+i;
        }
        System.out.print(x+";");
        System.out.print (y);
    }
}
