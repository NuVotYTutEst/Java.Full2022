package tictactoe;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class primer2 {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
		 System.out.print("Введите первое и второе число:");
		 int a = sc.nextInt();
	     int b = sc.nextInt();
	     System.out.print(
	             "Введите тип операции которую хотите выполнить(+,-,*,/,%):");
	         char op = sc.next().charAt(0);
	         vso(a, b, op);
	     }
    public static int vso(int a, int b, char op) {
		 int otvet = 0;
	     else if (op == '%') {
	    	 otvet = a * b;
	        }
		 System.out.println("Ответ:" + otvet);
		 return otvet;
	 }
}