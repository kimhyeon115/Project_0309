package Package_5;

import java.util.ArrayList;

public class Student2 {
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student2(int studentID, String studentName) {
		this.studentID =studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	public void showSubjectInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			System.out.println("학생 " + studentName + "님의 " + subjectList +
					" 과목의 성적은 " + subject.getScorePoint() + "점 입니다");
			total += subject.getScorePoint();
		}
		System.out.println("학생 " + studentName + "님의 총점은 " + total +
				"점 입니다");
	}
}
