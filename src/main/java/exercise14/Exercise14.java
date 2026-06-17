package exercise14;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * Excel 的行(Column)有兩種表示法：
         * 1. 可以 A,B,C,....,Z,AA,AB,AC......
         * 2. 數字表示
         * 其中
         *  A -> 1
         *  B -> 2
         *  .......
         *  Z -> 26
         *  AA -> 27
         *  AB -> 28
         *  ........
         *  ZY -> 701
         *  
         *  請寫出一個轉換方式，輸入數字，轉換為標題表示
         *  不限使用迴圈或遞迴
         *  
         *  提示：
         *      可能需要使用 ASCII 轉換字元及數字做計算
         */
		System.out.println("請輸入 Excel 行索引值");
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()) {
			int n = scanner.nextInt();
			if (n > 0) {
				System.out.println(ConvertDigitToTitle(n));
			} else {
				System.out.println("索引值須大於0");
			}
		} else {
			System.out.println("輸入錯誤");
		}
		
	}
	
	public static String ConvertDigitToTitle(int num) {
		return num < 1 ? "" : ConvertDigitToTitle((num - 1) / 26) + (char)((num - 1) % 26 + 'A');
	}

}
