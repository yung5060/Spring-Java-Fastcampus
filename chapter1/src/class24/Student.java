package class24;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;

    private ArrayList<Subject> subjects;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjects = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void addSubject(String subjectName, int score) {
        Subject subject = new Subject(subjectName, score);
        subjects.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("학생 " + studentName + "의 " + subjects.get(i).getSubjectName() + " 과목 성적은 " + subjects.get(i).getScore() + "입니다.");
            total += subjects.get(i).getScore();
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다");
    }
}
