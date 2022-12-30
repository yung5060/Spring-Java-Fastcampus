package class14;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class MemberHashMapTest {

    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();
        memberHashMap.addMember(new Member(1, "Yung"));
        memberHashMap.addMember(new Member(2, "Minseok"));
        memberHashMap.addMember(new Member(3, "Youngwoo"));
        memberHashMap.addMember(new Member(6, "Seonil"));

        memberHashMap.showAllMembers();

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1001, "Kim");
        hashMap.put(1002, "Lee");
        hashMap.put(1003, "Park");
        hashMap.put(1004, "Hong");
        hashMap.put(1005, "Cho");
        System.out.println(hashMap);
    }
}
