package chapter17.arrayList;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		
		MemberArrayList memberArrayList=new MemberArrayList();
	           //팀원정보	
                Member memberShin=new Member(1001, "신진혁");
        		Member memberShin1=new Member(1002, "신화진");
        		Member memberShin2=new Member(1003, "윤혜경");
        		Member memberShin3=new Member(1004, "이진학");
        		Member memberShin4=new Member(1005, "조현수");
        		Member memberShin5=new Member(1006, "정하영");
        		
        		//회원가입
        		memberArrayList.addMember(memberShin);
        		memberArrayList.addMember(memberShin1);
        		memberArrayList.addMember(memberShin2);
        		memberArrayList.addMember(memberShin3);
        		memberArrayList.addMember(memberShin4);
        		memberArrayList.addMember(memberShin5);
		
        		memberArrayList.showAllMember();
        		
        		memberArrayList.removeMember(memberShin1.getMemberId());
        		memberArrayList.showAllMember();
	}

}
