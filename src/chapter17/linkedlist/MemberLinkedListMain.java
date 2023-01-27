package chapter17.linkedlist;

import chapter17.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		//순서 o 중복 o
		
		MemberLinkedList memberLinkedList=new MemberLinkedList();
	    //팀원정보	
        Member memberShin=new Member(1001, "신진혁");
		Member memberShin1=new Member(1002, "신화진");
		Member memberShin2=new Member(1003, "윤혜경");
		Member memberShin3=new Member(1004, "이진학");
		Member memberShin4=new Member(1005, "조현수");
		Member memberShin5=new Member(1006, "정하영");
		
		//회원가입
		memberLinkedList.addMember(memberShin);
		memberLinkedList.addMember(memberShin1);
		memberLinkedList.addMember(memberShin2);
		memberLinkedList.addMember(memberShin3);
		memberLinkedList.addMember(memberShin4);
		memberLinkedList.addMember(memberShin5);
		
		memberLinkedList.showAllMember();
		
		Member memberKim=new Member(1003, "김서우")
		memberLinkedList.showAllMember();

	}

}
