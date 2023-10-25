package tictactoe;

import java.util.Scanner;

public class UmnoschenieMatric {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Напишите кол-во строк в первой матрице: =D");
		int n=sc.nextInt();// Количество строк первой матрицы
		System.out.println("Напишите кол-во столбцов в первой матрице и кол-во строк во второй матрице:");
		int m=sc.nextInt();// Количество столбцов в первой матрице и количество строк во второй матрице
		System.out.println("Напишите кол-во столбцов во второй матрице:");
		int k=sc.nextInt();// Количество столбцов во второй матрице
		int Maze[][]=new int[n][m];
		int Maze1[][]=new int[m][k];
		int Maze2[][]=new int[n][k];
		System.out.println("Вводим данные первой матрицы:");
		for(int i=0;i<n;i++)// Вводим данные первой матрицы
		{
			for(int j=0;j<m;j++)
			{
				Maze[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Вводим данные второй матрицы:");
		for(int i=0;i<m;i++)// Вводим данные второй матрицы
		{
			for(int j=0;j<k;j++)
			{
				Maze1[i][j]=sc.nextInt();
				
			}
		}		
		//Умножение
		for(int i=0;i<n;i++)
		{
			for(int u=0;u<k;u++)
			{
				for(int j=0;j<m;j++)
				{

					Maze2[i][u]+=Maze[i][j]*Maze1[j][u];
				}
			}
		}
		System.out.println("Вывод получившейся матрицы матрицы:");
		for(int i=0;i<n;i++)// Вывод третьей матрицы
		{
			for(int j=0;j<k;j++)
			{
				System.out.print(Maze2[i][j]+" ");
				
			}
			System.out.println();
		}

	}
}