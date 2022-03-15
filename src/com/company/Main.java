package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inp=new Scanner(System.in);
        int sayac=0,a=0;
        for (int i =2;i<100;i++){
            for (int j=2;j<100;j++)
                if (i%j==0){
                    sayac++;

                }
            if (sayac<2){
                System.out.print(i+" ");

            }sayac=0;
        }




    }
}
