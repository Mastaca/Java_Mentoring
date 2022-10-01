package School;

public class Student {

    public String studentFirstName;
    public String studentLastName;
    public char studentClass;
    public int markMath, markIT, markRomanian;

    public Student(String studentFirstName,
                   String studentLastName,
                   char studentClass,
                   int markMath,
                   int markIT,
                   int markRomanian) {
        setStudentFirstName(studentFirstName);
        setStudentLastName(studentLastName);
        setStudentClass(studentClass);
        setMarkMath(markMath);
        setMarkIT(markIT);
        setMarkRomanian(markRomanian);
    }

    public void displayMedianMarks() {
        int medianMarks = (markMath + markIT + markRomanian)/3;
        System.out.println(medianMarks);
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public void setStudentClass(char studentClass) {
        this.studentClass = studentClass;
    }

    public void setMarkMath(int markMath) {
        this.markMath = markMath;
    }

    public void setMarkIT(int markIT) {
        this.markIT = markIT;
    }

    public void setMarkRomanian(int markRomanian) {
        this.markRomanian = markRomanian;
    }
}
