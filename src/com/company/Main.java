package com.company;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input 2 numbers to find the DCD and LCM: ");
        int num = Sc.nextInt();
        int num1 = Sc.nextInt();
        int GCD = findGCD(num,num1);
        System.out.println("GCD: "+ GCD);
    }
    public static int findGCD(int num, int num2){
        if(num2 == 0){
            return num;
        }
        return findGCD(num2,num%num2);
    }
}
