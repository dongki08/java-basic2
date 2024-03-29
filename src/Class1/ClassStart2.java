package Class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[]studentName = {"학생1", "학생2", "학생3"};
        int[] studentAge = {15, 16, 20};
        int[] studentGrade = {90, 80, 85};

        for(int i = 0; i < studentName.length; i++) {
            System.out.printf("이름 : %s 나이 : %d 성적 : %d\n"
                    ,studentName[i], studentAge[i], studentGrade[i]);
        }
    }
}
