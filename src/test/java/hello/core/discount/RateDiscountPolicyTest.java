package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인 받는다")
    void vip_o() {
        //given
        Member memberA = new Member(1L, "memberA", Grade.VIP);

        //when
        int discount = rateDiscountPolicy.discount(memberA,10000);

        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인 받지 않는다")
    void vip_x() {
        //given
        Member memberB = new Member(2L, "MemberB", Grade.BASIC);

        //when
        int discount = rateDiscountPolicy.discount(memberB,10000);

        //then
        assertThat(discount).isEqualTo(0);

    }

}