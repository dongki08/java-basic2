package Class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름 : " + student1Name + " 나이 : " + student1Age + " 성적 : " + student1Grade);
        System.out.println("이름 : " + student2Name + " 나이 : " + student2Age + " 성적 : " + student2Grade);


        String[]studentName = {"학생1", "학생2"};
        int[] studentAge = {15, 16};
        int[] studentGrade = {90, 80};

        for(int i = 0; i < studentName.length; i++) {
            System.out.printf("이름 : %s 나이 : %d 성적 : %d\n"
                    ,studentName[i], studentAge[i], studentGrade[i]);
        }
    }
}
