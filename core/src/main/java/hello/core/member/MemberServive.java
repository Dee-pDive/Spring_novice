package hello.core.member;

public interface MemberServive {
	
	void join(Member member);
	
	Member findMember(Long memberId);

}
