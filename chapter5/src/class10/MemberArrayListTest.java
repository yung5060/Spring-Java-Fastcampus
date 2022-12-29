package class10;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();
        memberArrayList.addMember(new Member(1, "Yung"));
        memberArrayList.addMember(new Member(2, "Minseok"));
        memberArrayList.addMember(new Member(3, "Youngwoo"));
        memberArrayList.addMember(new Member(4, "Seonil"));

        memberArrayList.showAllMembers();

        memberArrayList.removeMember(3);

        memberArrayList.showAllMembers();
    }
}
