package racingCar.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private static Car testCar;

    @BeforeAll
    static void setup() {
        testCar = new Car();
    }

    @Test
    void 생성자_동작_확인() {
        assertThat(testCar)
                .isNotNull();
    }

    @Test
    void 자동차_이동_로직_확인() {
        testCar.go(3);
        assertThat(testCar.getTravelDistance())
                .isEqualTo(0);
        testCar.go(4);
        assertThat(testCar.getTravelDistance())
                .isEqualTo(1);
    }
}
