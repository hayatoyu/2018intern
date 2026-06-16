package exercise6;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		System.out.print("請輸入一整數：");
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		if(scanner.hasNextInt()) {
			num = scanner.nextInt();
		} else {
			System.out.println("錯誤！你輸入的不是整數");
			return;
		}
		scanner.close();
		
		if(num > 1) {
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0) {
					System.out.println(num + " 不是質數");
					return;
				}
			}
			System.out.println(num + " 是質數");
		} else {
			System.out.println("只有大於 1 的整數才能討論是否為質數");
		}
	}

}
