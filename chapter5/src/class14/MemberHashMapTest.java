package class14;

import java.util.Comparator;
import java.util.TreeSet;

public class MemberHashMapTest {

    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();
        memberHashMap.addMember(new Member(1, "Yung"));
        memberHashMap.addMember(new Member(2, "Minseok"));
        memberHashMap.addMember(new Member(3, "Youngwoo"));
        memberHashMap.addMember(new Member(6, "Seonil"));

        memberHashMap.showAllMembers();

//        memberHashMap.addMember(new Member(5, "Park"));
//
//        memberHashMap.showAllMembers();

    }
}
