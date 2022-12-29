package class12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet() {
        this.hashSet = new HashSet<>();
    }

    public MemberHashSet(int size) {
        this.hashSet = new HashSet<>(size);
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {

//        for (int i = 0; i < arrayList.size(); i++) {
//            if (memberId == arrayList.get(i).getMemberId()) {
//                arrayList.remove(i);
//                return true;
//            }
//        }
        Iterator<Member> ir = hashSet.iterator();
        while(ir.hasNext()) {
            Member member = ir.next();
            if (member.getMemberId() == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMembers() {
        for (Member member : hashSet) {
            System.out.print(member + " ");
        }
        System.out.println();
    }
}
