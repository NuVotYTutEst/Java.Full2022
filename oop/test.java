package oop;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число:");
		int a = sc.nextInt();
		int b = 1;
		  for (int i = 1; i <= a; i++) {
		     b = b * i;
		  }
		  System.out.print("Факториал:");
		  System.out.print(b);
	}
}
