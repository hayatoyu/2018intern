package exercise16;

public class Employee {
	
	private int id, income;
	private String name;
	private Sex sex;
	
	public enum Sex {
		Male, Female
	}
	
	public Employee(int id, String name, Sex sex, int income) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.income = income;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
}