package class13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return (-1) * o1.compareTo(o2);
    }
}

public class MemberTreeSetTest {

    public static void main(String[] args) {

//        MemberTreeSet memberTreeSet = new MemberTreeSet();
//        memberTreeSet.addMember(new Member(1, "Yung"));
//        memberTreeSet.addMember(new Member(2, "Minseok"));
//        memberTreeSet.addMember(new Member(3, "Youngwoo"));
//        memberTreeSet.addMember(new Member(6, "Seonil"));
//
//        memberTreeSet.showAllMembers();
//
//        memberTreeSet.addMember(new Member(5, "Park"));
//
//        memberTreeSet.showAllMembers();

        TreeSet<String> set = new TreeSet<String>(new MyCompare());
        set.add("Park");
        set.add("Kim");
        set.add("Lee");
        set.add("Cho");

        System.out.println(set);
    }
}
