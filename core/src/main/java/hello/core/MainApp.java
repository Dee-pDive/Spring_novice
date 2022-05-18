package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemberServive;

public class MainApp {

	public static void main(String[] args) {
		
		MemberServive memberServive = new MemberServiceImpl();
		Member member = new Member(1L, "memberA", Grade.VIP );
		memberServive.join(member);
		
		Member findMember =  memberServive.findMember(1L);
		System.out.println("new member ="+ member.getName());
		System.out.println("find member ="+ findMember.getName());
		
	}
}
