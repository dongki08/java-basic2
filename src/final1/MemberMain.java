package final1;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "Kim");
        Member member1 = new Member("myId", "Kim");
        member.print();
        member.changeData("seo");
        member.print();
    }
}
