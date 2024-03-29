package Class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 22;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;


        System.out.printf("이름 : %s 나이 : %d 성적 : %d",students[0].name, students[0].age, students[0].grade);
        System.out.printf("이름 : %s 나이 : %d 성적 : %d",student2.name, student2.age, student2.grade);
    }
}
