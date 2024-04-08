package Class1.construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit menber1 = new MemberInit();
        menber1.name = "user1";
        menber1.age = 11;
        menber1.grade = 80;

        MemberInit menber2 = new MemberInit();
        menber2.name = "user2";
        menber2.age = 15;
        menber2.grade = 90;

        MemberInit[] members = {menber1, menber2};

        for (MemberInit member : members) {
            System.out.println("이름 : " + member.name + " 나이 : " + member.age + "성적 : " + member.grade);
        }
    }
}
