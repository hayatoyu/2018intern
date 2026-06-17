package exercise12;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 九九乘法表遞迴作法
		MultipleTable(1,1);
	}
	
	public static void MultipleTable(int i, int j) {
		if (j > 9) {
			j -= 9;
			i++;
			System.out.println();
		}
		if (i > 9)
			return;
		System.out.print(i + " * " + j + " = " + (i * j) + "\t");
		MultipleTable(i, ++j);
	}

}
