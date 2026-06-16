package exercise7;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 九九乘法表
		for(int i =1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}

}
