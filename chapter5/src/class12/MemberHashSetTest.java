package class12;

public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();
        memberHashSet.addMember(new Member(1, "Yung"));
        memberHashSet.addMember(new Member(2, "Minseok"));
        memberHashSet.addMember(new Member(3, "Youngwoo"));
        memberHashSet.addMember(new Member(4, "Seonil"));

        memberHashSet.showAllMembers();

        memberHashSet.addMember(new Member(3, "Park"));

        memberHashSet.showAllMembers();

//        memberHashSet.removeMember(3);

//        memberHashSet.showAllMembers();
    }
}
