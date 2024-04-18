// 메서드 없이 멤버 정보 출력
package construct;

public class MemberInitMain1 {
	public static void main(String[] args) {
		MemberInit member1 = new MemberInit(); // 인스턴스화하여 객체 생성
		member1.name = "user1";
		member1.age = 15;
		member1.grade = 90; // 초기화
		
		MemberInit member2 = new MemberInit();
		member2.name = "user2";
		member2.age = 16;
		member2.grade = 80;
		
		MemberInit[] members = {member1, member2};
		
		for (MemberInit s : members) {
			System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
		}
	}
}


// 메서드 추가하여 멤버 정보 출력
// 1. 다른 클래스에서 메서드 추가
package construct;

public class MemberInitMain2 {
	public static void main(String[] args) {
		MemberInit member1 = new MemberInit(); // 인스턴스화하여 객체 생성
		// 메서드 이용한 초기화1
		initMember(member1, "user1", 15, 90);
		
		MemberInit member2 = new MemberInit();
		// 메서드 이용한 초기화2
		initMember(member2, "user2", 16, 80);
		
		MemberInit[] members = {member1, member2};
		
		for (MemberInit s : members) {
			System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
		}
	}
	
	static void initMember(MemberInit member, String name, int age, int grade) {
		member.name = name;
		member.age = age;
		member.grade = grade;
	}
}

// 2. 같은 클래스에서 메서드 추가
package construct;

public class MemberInit {
	String name;
	int age;
	int grade;
	
	// 메서드 추가
	void initMember(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}

// 같은 클래스 내에서 사용하기에 member가 필요없고 this를 통해 값 할당
package construct;

public class MemberInitMain3 {
	public static void main(String[] args) {
		MemberInit member1 = new MemberInit(); // 인스턴스화하여 객체 생성
		// 메서드 이용한 초기화1
		member1.initMember("user1", 15, 90);
		
		MemberInit member2 = new MemberInit();
		// 메서드 이용한 초기화2
		member2.initMember("user2", 16, 80);
		
		MemberInit[] members = {member1, member2};
		
		for (MemberInit s : members) {
			System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
		}
	}
}
