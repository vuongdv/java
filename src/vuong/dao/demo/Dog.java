package vuong.dao.demo;

public class Dog {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void printAction() {
		System.out.println("go go");
	}
	public void printAge() {
		System.out.println("18");
	}
}
