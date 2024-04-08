package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceimpl;

public class Appconfig {
    public MemberService memberService(){
        return new MemberServiceimpl(new MemoryMemberRepository());
    }
    public OrderService orderService(){
        return new OrderServiceimpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
