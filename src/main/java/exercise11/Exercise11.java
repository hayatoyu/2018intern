package exercise11;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 計算 1-100 的和，使用遞迴做法
		System.out.println(Sum(100));
	}
	
	public static int Sum(int n) {
		if (n == 1)
			return n;
		else 
			return n + Sum(n - 1);
	}

}
