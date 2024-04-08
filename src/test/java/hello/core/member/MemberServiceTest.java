package hello.core.member;

import hello.core.Appconfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MemberServiceTest {
    MemberService memberService;

    @BeforeEach()
    public void beforeEach(){
        Appconfig appconfig = new Appconfig();
        memberService = appconfig.memberService();
    }

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findmember = memberService.findMember(1L);

        //then
        assertThat(member).isEqualTo(findmember);
    }

    @Test
    void findMember() {
    }
}