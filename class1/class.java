
/* 학생 정보 출력 프로그램
두명의 학생 정보 출력하는데
각 학생은 이름, 나이, 성적 가지고 있음

1. 홍길동, 15, 90
2. 장발장, 16, 80

출력 `이름: [이름] 나이: [나이]세 성젹: [성적]점`
*/

// 변수를 사용하여 저장 및 출력
package class1;

public class ClassStart1 {

	public static void main(String[] args) {
	
		String stuName1 = "홍길동";
		int stuAge1 = 15;
		int stuGrade1 = 90;
		
		String stuName2 = "장발장";
		int stuAge2 = 16;
		int stuGrade2 = 80;
		
		System.out.println("이름: " + stuName1 + " 나이: " + stuAge1 + "세 성적: " + stuGrade1 + "점");
		System.out.println("이름: " + stuName2 + " 나이: " + stuAge2 + "세 성적: " + stuGrade2 + "점");

	}

}


// 배열을 사용하여 저장 및 출력
package class1;

public class ClassStart2 {

	public static void main(String[] args) {
		
		String[] stuNames = {"홍길동", "장발장"};
		int[] stuAges = {15, 16};
		int[] stuGrades = {90, 80};
		
		
		for (int i = 0; i < stuNames.length; i++) {
			System.out.println("이름: " + stuNames[i] + " 나이: " + stuAges[i] + "세 성적: " + stuGrades[i] + "점");
		}
		

	}

}



// 클래스를 사용하여 저장 및 출력
package class1;

public class Student {
	String stuName;
	int stuAge;
	int stuGrade;
}

package class1;

public class ClassStart3 {

	public static void main(String[] args) {
		Student stu1 = new Student(); // 메모리에 학생 클래스 생성하여 stu1에 담아둠
		stu1.stuName = "홍길동";
		stu1.stuAge = 15;
		stu1.stuGrade = 90;
		
		Student stu2 = new Student();
		stu2.stuName = "장발장";
		stu2.stuAge = 16;
		stu2.stuGrade = 80;
		
		
		System.out.println("이름: " + stu1.stuName + " 나이: " + stu1.stuAge + "세 성적: " + stu1.stuGrade + "점");
		System.out.println("이름: " + stu2.stuName + " 나이: " + stu2.stuAge + "세 성적: " + stu2.stuGrade + "점");
		
		
		// Student stu1 = new Student(); -> Student 객체 생성
		// Student stu1 = 0x0099ff; -> new Student() 결과로 참조값(주소) 반환
		// stu1 = 0x0099ff; -> stu1 변수에 주소값이 담김
	}

}




// 클래스에 배열 도입
package class1;

public class ClassStart4 {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.stuName = "홍길동";
		stu1.stuAge = 15;
		stu1.stuGrade = 90;
		
		Student stu2 = new Student();
		stu2.stuName = "장발장";
		stu2.stuAge = 16;
		stu2.stuGrade = 80;
		
		
		Student[] Students = new Student[2]; // student 타입의 배열 2칸 생성
		Students[0] = stu1;
		Students[1] = stu2;
		
		System.out.println(Students[0].stuName); // 배열 접근 시작
		// 1) System.out.println(005[0].stuName); -> [0]을 사용해서 005 배열의 0번 요소에 접근
		// 2) System.out.println(001.stuName); -> .(dot)을 사용해서 참조값으로 객체에 접근
		// 3) System.out.println("홍길동"); -> 홍길동 출력
	}

}




// 리펙토링 작업
package class1;

public class ClassStart5 {

	public static void main(String[] args) {
		Student[] Students = new Student[2];
		Students[0] = new Student();
		Students[1] = new Student();
		
		Students[0].stuName = "홍길동";
		Students[0].stuAge = 15;
		Students[0].stuGrade = 90;
		
		Students[1].stuName = "장발장";
		Students[1].stuAge = 16;
		Students[1].stuGrade = 80;
		
		
		for (int i = 0; i < Students.length; i++) {
			System.out.println("이름: " + Students[i].stuName + " 나이: " + Students[i].stuAge + "세 성적: " + Students[i].stuGrade + "점");
		}
		
		// for each 문으로 좀 더 간략하게 출력
		for (Student s : Students) {
			System.out.println("이름: " + s.stuName + " 나이: " + s.stuAge + "세 성적: " + s.stuGrade + "점");
		}
		
	}

}
