import java.util.List;

public class Output {
	public void print(List<Student> list) {
		this.printLabel();
		for(Student student : list) {
			System.out.println(student); // student.toString()  재정의한 toString()
		}
	}
	
	private void printLabel() {
		System.out.println("<<<<센텀대학교 성적관리프로그램>>>>");
		System.out.println("학번\t\t 이름\t\t 국어\t\t 영어\t\t 수학\t\t 전산\t\t 총점\t\t 평균\t\t 평점");
		System.out.println("----------------------------------------------------");
	}

}
