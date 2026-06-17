package exercise16;

import java.util.Arrays;

import exercise16.Employee.Sex;

public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = new Employee[4];
		employees[0] = new Employee(1, "Leo", Sex.Male, 5000000);
		employees[1] = new Employee(2, "Judy", Sex.Female, 2400000);
		employees[2] = new Employee(3, "Amy", Sex.Female, 3000000);
		employees[3] = new Employee(4, "Ted", Sex.Male, 1200000);
		
		// 挑出男員工
		System.out.println("男性員工名單為：");
		selectBySex(employees, Sex.Male);
		
		System.out.println("年薪在 240 萬以上的員工有：");
		selectByIncome(employees, 2400000);
		
		System.out.println("員工編號為 4 的員工為：");
		selectById(employees, 4);
		
	}
	
	public static void selectBySex(Employee[] employees, Sex sex) {
		Arrays.stream(employees)
			.filter(e -> e.getSex().equals(sex))
			.forEach(e -> System.out.print(e.getName() + "\t\n"));
	}
	
	public static void selectByIncome(Employee[] employees, int income) {
		for (Employee e : employees) {
			if (e.getIncome() >= income) {
				System.out.print(e.getName() + "\t\n");
			}
		}
	}
	
	public static void selectById(Employee[] employees, int id) {
		Arrays.stream(employees)
			.filter(e -> e.getId() == id)
			.forEach(e -> System.out.print(e.getName() + "\t\n"));
	}

}
