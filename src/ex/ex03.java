package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021038 傅琬鈞
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean a = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				a = false;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		if (a == true) {
			System.out.println("質數");
		} else {
			System.out.println("非質數");

		}
	}
}
