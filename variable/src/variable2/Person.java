package variable2;

public class Person {
	// 필드
	private String name;
	private int age;
	private double height;
	private double weight;

	// 생성자: 필드의 초기값 지정.
	public Person() {
		this.name = "초기이름";
		this.age = 10;
		this.height = 170.0;
		this.weight = 65.0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 메소드
	public void showInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 키: " + height + " 입니다");
	}

	// 필드에 값을 저장, 불러오는 기능.
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
		else
			this.age = 0;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

}
