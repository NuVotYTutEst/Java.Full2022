package oop;

import java.util.Arrays;
import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 0, 0};
		Scanner sc = new Scanner(System.in);
    	System.out.println("Введите элементы массива:");
    	for(int i = 0; i < arr.length; i++) {
            	arr[i] = sc.nextInt();
            }
    	System.out.println();
    	int min = arr[0];
    	for(int i = 0; i < arr.length; i++) {
    		if(min > arr[i]) {
    			min = arr[i];
    		}
    	}
    	int max = arr[0];
    	for(int i = 0; i < arr.length; i++) {
    		if(max < arr[i]) {
    			max = arr[i];
    		}
    	}  	
    	System.out.println(min);
    	System.out.println(max);
        }
	}

