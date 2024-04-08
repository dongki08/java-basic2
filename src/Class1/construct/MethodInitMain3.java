package Class1.construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit menber1 = new MemberInit();
        menber1.initMember("user1", 19, 80);

        MemberInit menber2 = new MemberInit();
        menber2.initMember("user2", 20, 90);

        MemberInit[] members = {menber1, menber2};

        for (MemberInit member : members) {
            System.out.println("이름 : " + member.name + " 나이 : " + member.age + "성적 : " + member.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
