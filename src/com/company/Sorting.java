package com.company;

import java.util.Scanner;

public class Sorting {
    public void sort() {
        int i,j,temp;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for (i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        for (i = 0; i < n; i++){
            for(j=0;j<n;j++) {
                if (num[i]<num[j])
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
            System.out.println(num[i]);
    }
}
