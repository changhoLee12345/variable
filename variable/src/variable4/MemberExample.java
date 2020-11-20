package variable4;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setMemberNo(1);
		m1.setMemberName("홍길동");
		
		System.out.println(m1.getMemberNo());
		System.out.println(m1.getMemberName());
		
		System.out.println(m1.toString());
	}
}
