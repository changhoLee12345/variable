package variable5;

public class Member {
	private int memberNo;
	private String memberName;
	private String memberPhone;
	private String memberClass;
	
	public Member() { // 기본생성자:매개변수X
		
	}
	
	public Member(int memberNo, String memberName) {
		this.memberNo = memberNo;
		this.memberName = memberName;
	}

	public Member(int memberNo,
			      String memberName,
			      String memberPhone,
			      String memberClass) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberClass = memberClass;
	}

	public int getMemberNo() {
		return memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public String getMemberClass() {
		return memberClass;
	}

}
