package exercise13;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println("請輸入 n 層河內塔");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			n = scanner.nextInt();
		} else {
			System.out.println("未輸入合法數字，程式即將結束");
		}
		scanner.close();
		if (n > 0) {
			Hanoi(1, n, n, 'A', 'B', 'C');
		} else {
			System.out.println("n 需要大於 0 程式才能運作");
		}
	}
	
	public static int Hanoi(int step,int n,int no,char source,char temp,char destination) {
		if (n == 1) {
			System.out.printf("步驟%d：將 %d 號盤從 %s 移至 %s \n", step, no, source, destination );
		} else {
			step = Hanoi(step, n - 1, n - 1, source, destination, temp);
			step = Hanoi(step, 1, n, source, temp, destination);
			step = Hanoi(step, n - 1, n - 1, temp, source, destination);
		}
		return n == 1 ? ++step : step;
	}

}
