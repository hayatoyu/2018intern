package exercise8;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 輾轉相除法
		Scanner scanner = new Scanner(System.in);
		int input1 = 0, input2 = 0, num1 = 0, num2 = 0;
		System.out.println("請輸入 2 個正整數");
		
		if(scanner.hasNextInt()) {
			input1 = scanner.nextInt();
			if(input1 <= 0) {
				System.out.println("錯誤！正整數必須大於0！");
				scanner.close();
				return;
			}
			if(scanner.hasNextInt()) {
				input2 = scanner.nextInt();
				if(input2 <= 0) {
					System.out.println("錯誤！正整數必須大於0！");
					scanner.close();
					return;
				}
			} else {
				System.out.println("僅有一個數字，程式無法運行，即將結束");
				scanner.close();
				return;
			}
		} else {
			System.out.println("沒有接收到數字，程式即將結束");
			scanner.close();
			return;
		}
		
		num1 = input1;
		num2 = input2;
		
		while((num1 % num2 > 0) && (num2 % num1 > 0)) {
			if(num1 > num2) {
				num1 %= num2;
			} else {
				num2 %= num1;
			}
		}
		
		System.out.println(input1 + " 與 " + input2 + " 的最大公因數為 " + Math.min(num1, num2));
	}

}
