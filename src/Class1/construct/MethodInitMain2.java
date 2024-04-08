package Class1.construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit menber1 = new MemberInit();
        initMember(menber1, "철수", 19, 90);

        MemberInit menber2 = new MemberInit();
        initMember(menber2, "영희", 29, 80);

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
