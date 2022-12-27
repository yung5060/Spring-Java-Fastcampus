package class2;

public class Student implements Cloneable {

    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNum=" + studentNum +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            if (this.studentNum == std.studentNum) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
