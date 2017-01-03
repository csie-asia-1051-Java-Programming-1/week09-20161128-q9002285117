package hw;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數，利用函式呼叫找出一連續整數數列讓該數列的和為此一正整數，有些正整數並不能找出連續整數，若找不到時，請印出「No」。
 例如: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 105021038 傅琬鈞
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		int o = 0;
		fun1(n, sum, o);
	}

	public static void fun1(int a, int b, int c) {
		for (int i = 1; i < a; i++) {
			c = 1;
			b = 0;
			for (int j = i; j < a; j++) {
				b = b + j;
				if (b == a) {
					System.out.print("=");
					for (int k = i; k <= j; k++) {
						System.out.print(k);
						if (k < j) {
							System.out.print("+");
						}
					}
					System.out.println();
				}
			}
		}
		if (c == 0) {
			System.out.println("NO");
		}
	}
}
