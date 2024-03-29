package Class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 22;
        student2.grade = 80;

        Student[] students = {student1, student2};

        for(int i = 0; i < students.length; i++) {
            System.out.printf("이름 : %s 나이 : %d 성적 : %d\n",students[i].name, students[i].age, students[i].grade);
        }

        for(int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.printf("이름 : %s 나이 : %d 성적 : %d\n",s.name, s.age, s.grade);
        }

        for(Student s : students) {
            System.out.printf("이름 : %s 나이 : %d 성적 : %d\n",s.name, s.age, s.grade);
        }

    }
}
