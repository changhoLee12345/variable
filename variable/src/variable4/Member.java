package variable4;

public class Member {
	private int memberNo;
	private String memberName;
	private String memberPhone;
	private String memberClass;

	public int getMemberNo() {
		return this.memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberClass() {
		return memberClass;
	}

	public void setMemberClass(String memberClass) {
		this.memberClass = memberClass;
	}

	@Override
	public String toString() {
		return "Member [회원번호: " + memberNo + ", 회원이름: " + memberName + ", 연락처: " + memberPhone + ", 강좌: " + memberClass
				+ "]";
	}

}
