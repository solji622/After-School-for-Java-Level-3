package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;
	
	// 생성자
	MemberConstruct(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}

package construct;

public class MemberInitMain4 {
	public static void main(String[] args) {
		MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
		MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
		
		
		MemberConstruct[] members = {member1, member2};
		
		for (MemberConstruct s : members) {
			System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
		}

    // 반복 this 줄이기
    MemberConstruct(String name, int age) {
		this(name, age, 50);
	  }
	}
}
