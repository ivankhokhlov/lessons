package ru.omsk.khokhlov.bubble;

import java.util.Arrays;

public class BubbleSort {

        public static int[] bubbleSorter(int[] arr){
            for (int out = arr.length - 1; out >= 1; out--){
                for (int in = 0; in < out; in++){
                    if(arr[in] > arr[in + 1]) {
                        arr[in]=arr[in]+arr[in+1];
                        arr[in+1]=arr[in]-arr[in+1];
                        arr[in]=arr[in]-arr[in+1];
                    }
                }
            }
            return arr;
        }


    public static void main(String[] args) {
                int[] arr = new int[] {300,200,100,256,2727,2232};
                int[] arr2 = BubbleSort.bubbleSorter(arr);
                for(int item : arr2){
                    System.out.println(item);
                }
    }
}