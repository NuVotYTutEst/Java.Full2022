package tictactoe;

import java.util.Scanner;

public class PifagorTroiki {
	public static void main(String[] args) {
		int[] arr = {0, 0, 0};
	Scanner scan = new Scanner(System.in);
	System.out.println("Введите элементы массива:");
	for(int i = 0; i < arr.length; i++) {
        	arr[i] = scan.nextInt();
    }
	if( (arr[0] * arr[0] - 1) / 2 == arr[1]) {
			if( (arr[0] * arr[0] + 1) / 2 == arr[2]) {
				System.out.println("Считаеться пифагоровыми тройками");
			}
	}
	else {
		System.out.println("Несчитаеться пифагоровыми тройками");//qweertyuhjfleelgjkhg
	}
}
}

