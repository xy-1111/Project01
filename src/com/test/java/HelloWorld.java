package com.test.java;

import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {
         int q[]={19,4,42,21,3};
         int l=0,r=4;
         System.out.println(Arrays.toString(q));
         quick_sort(q,l,r);
//        for (int i = 0; i < q.length; i++) {
//            System.out.println(q[i]);
//        }
         System.out.println(Arrays.toString(q));
    }

//  快速排序法
    public static int quick_sort(int q[],int l,int r){
        if (l>=r) return 0;
        int x = q[l];
        int i=l-1;
        int j=r+1;
        while(i<j){
            do i++;while (q[i]<x);
            do j--;while (q[j]>x);
            if(i<j) {
                int tmp=q[i];
                q[i]=q[j];
                q[j]=tmp;
            }
        }
        quick_sort(q,l,j);
        quick_sort(q,j+1,r);
        return 0;
    }

}
