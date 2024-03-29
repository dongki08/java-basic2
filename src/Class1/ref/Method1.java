package Class1.ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.garde = 80;

        printStudent(student1);
        printStudent(student2);
        System.out.println("이름 " + student1.name + " 나이 " + student1.age + " 성적 " + student1.garde);

    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.garde = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름 " + student.name + " 나이 " + student.age + " 성적 " + student.garde);
    }
}
