package variable2;

public class VariableExample {
	public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		double dbl = 3.4;

		String name = "Hong";
		int age = 10;
		double height = 178.8;

		String name1 = "Hwang";
		int age1 = 15;
		double height1 = 188.8;

		Person p1 = new Person("Choi", 20, 175.5, 72.4);
		System.out.println("p1의 이름:" + p1.getName());
		System.out.println("p1의 나이:" + p1.getAge());
		System.out.println("p1의 키:" + p1.getHeight());

		System.out.println("================");
		p1.setName("홍");
		p1.setName("Hong");
		p1.setAge(10);
		p1.setHeight(178.8);
		System.out.println("p1의 이름:" + p1.getName());
//		System.out.println("p1의 나이:" + p1.getAge());
//		System.out.println("p1의 키:" + p1.getHeight());
//		p1.showInfo();

		Person p2 = new Person();
		p2.setName("Hwang");
		p2.setAge(15);
		p2.setHeight(188.8);
//		p2.showInfo();

		Person p3 = new Person();
		p3.setName("Park");
		p3.setAge(17);
		p3.setHeight(166.8);
//		p3.showInfo();

//		p3.weight = 56.5;

		Person[] persons = { p1, p2, p3 };
		for (Person per : persons) {
			per.showInfo();
		}

	}
}
