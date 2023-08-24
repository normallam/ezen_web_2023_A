package java2.day25_제네릭2.Ex2;

public class Ex2_와일드제네릭타입 {

	public static void main(String[] args) {
		
		// 1. 모든 사람이 신청 가능
			// 1. 사람 객체
		Person person = new Person();
			// 2. 지원자 객체[지원자 생성자에 사람 객체를 대입]
		Applicant<Person> applicant = new Applicant<>(person);
		
			// 3. 모든 객체가 지원 가능한 코스 등록 함수
			Course.registerCourse1(applicant);
			
			// ------코스 1 : (모든 지원서(사람,직장인,학생)) 누구나 등록 가능한 코스
		
			Course.registerCourse1(new Applicant<Person>(new Person()));
			Course.registerCourse1(new Applicant<Worker>(new Worker()));
			Course.registerCourse1(new Applicant<Student>(new Student()));
			Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
			Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
			System.out.println();
			
			// 2. 학생만 신청 가능
				// Applicant< ? extends Student > applicant
				// 지원서 중에 Student 객체 와 Student 자손객체만 가능 [Person, Worker 불가능]
			//Course.registerCourse2(new Applicant<Person>(new Person()));
			//Course.registerCourse2(new Applicant<Worker>(new Worker()));
			Course.registerCourse2(new Applicant<Student>(new Student()));
			Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
			Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
			
			// 3. 직장인 및 일반인만 신청 가능
				//Applicant< ? super Worker> applicant
			Course.registerCourse3(new Applicant<Person>(new Person()));
			Course.registerCourse3(new Applicant<Worker>(new Worker()));
			//Course.registerCourse3(new Applicant<Student>(new Student()));
			//Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
			//Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
	}
	
}
