package hello.core.xml;

import hello.core.member.MemberService;
import org.assertj.core.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.assertj.core.api.Assumptions.*;

public class XmlAppConfigTest {

    @Test
    void xmlAppContext() {
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assumeThat(memberService).isInstanceOf(MemberService.class);

    }
}
