package class10;

import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        this.arrayList = new ArrayList<>();
    }

    public MemberArrayList(int size) {
        this.arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {

        for (int i = 0; i < arrayList.size(); i++) {
            if (memberId == arrayList.get(i).getMemberId()) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMembers() {
        for (Member member : arrayList) {
            System.out.print(member + " ");
        }
        System.out.println();
    }
}
