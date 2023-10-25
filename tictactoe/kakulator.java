package tictactoe;
import java.util.Scanner;
public class kakulator {
	public static void main(String[] args) {
		 System.out.println(Vvode());
	 }
	 public static double Vvode() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Введите первое число:");
		 double a = sc.nextDouble();
		 System.out.print("Введите знак:");
		 char op = sc.next().charAt(0);
			 if (op == 's') {
		     	 return sin(a);
		        }
		     else if (op == 'c') {
		     	 return cos(a);
		        }
		     else if (op == 't') {
		     	 return tan(a);
		        }
		     else if (op == '2') {
		     	 return stepenb2(a);
		        }
		     else if (op == '3') {
		     	 return stepenb3(a);
		        }
		     else if (op == '<') {
		     	 return korenb2(a);
		        }
		     else if (op == '>') {
		     	 return korenb3(a);
		        }
		 System.out.print("Введите второе число:");
		 double b = sc.nextDouble();
		 if (op == '+'){
			return plus(a,b);
		 }
		 else if (op == '-') {
			 return minus(a,b);
	        }
	     else if (op == '*') {
	    	 return umnoshitb(a,b);
	        }
	     else if (op == '/') {
	    	 return delitb(a,b);
	        }
	     else if (op == '%') {
	    	 return procent(a,b);
	        }
		 return a; 
	 }
//	 public static double schtoto() {
//		 return Otvet(Pervoe(), Znak(), Vtoroe());
//	 }
	 public static double proverka(char op) {
		 if (op == 's') {
			 return op;
		 }
		 else if (op == 'c') {
			 return op;
	        }
	     else if (op == 't') {
	    	 return op;
	        }
	     else if (op == '2') {
	    	 return op;
	        }
	     else if (op == '3') {
	    	 return op;
	        }
	     else if (op == '<') {
	    	 return op;
	        }
	     else if (op == '>') {
	    	 return op;
	        }
		return op;
	 }
	 public static double plus(double a, double b) {
		 double otvet = 0;
		 otvet = a + b;
		 return otvet;
	 }
	 public static double minus(double a, double b) {
		 double otvet = 0;
		 otvet = a - b;
		 return otvet;
	 }
	 public static double umnoshitb(double a, double b) {
		 double otvet = 0;
	 	 otvet = a * b;
		 return otvet;
	 }
	 public static double delitb(double a, double b) {
		 double otvet = 0;
		 otvet = a / b;
		 return otvet;
	 }
	 public static double procent(double a, double b) {
		 double otvet = 0;
		 otvet = a % b;
		 return otvet;
	 }
	 public static double sin(double a) {
		 double otvet = 0;
		 otvet = Math.sin(Math.toRadians(a));
		 return otvet;
	 }
	 public static double cos(double a) {
		 double otvet = 0;
		 otvet = Math.cos(Math.toRadians(a));
		 return otvet;
	 }
	 public static double tan(double a) {
		 double otvet = 0;
		 otvet = Math.tan(Math.toRadians(a));
		 return otvet;
	 }
	 public static double stepenb2(double a) {
		 double otvet = 0;
		 otvet = Math.pow(a,2);
		 return otvet;
	 }
	 public static double stepenb3(double a) {
		 double otvet = 0;
		 otvet = Math.pow(a,3);
		 return otvet;
	 }
	 public static double korenb2(double a) {
		 double otvet = 0;
		 otvet = Math.sqrt(a);
		 return otvet;
	 }
	 public static double korenb3(double a) {
		 double otvet = 0;
		 otvet = Math.cbrt(a);
		 return otvet;
	 }
}

