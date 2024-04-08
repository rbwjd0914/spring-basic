package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceimpl();
        Member member = new Member(1L, "member1", Grade.VIP);
        memberService.join(member);

        Member findmember = memberService.findMember(1L);
        System.out.println("findmember = " + findmember.getName());
        System.out.println("member = " + member.getName());

    }
}
