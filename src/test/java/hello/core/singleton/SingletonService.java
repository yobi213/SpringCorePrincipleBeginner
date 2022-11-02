package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    //메소드 앞에 static 키워드를 붙이면 객체 생성없이 클래스를 통해 메서드를 직접 호출할 수 있다.
    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {}

    public void login() {
        System.out.println("싱글톤 객체의 로직 호출");
    }

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    public void singletonServiceTest() {

        SingletonService singletonService1 = SingletonService.getInstance();
        SingletonService singletonService2 = SingletonService.getInstance();

        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);

        assertThat(singletonService1).isSameAs(singletonService2);



    }

}
