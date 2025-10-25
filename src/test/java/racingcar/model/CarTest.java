package racingcar.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    @DisplayName("자동차 전진 테스트")
    void 자동차_전진_테스트() {
        Car testCar = new Car("pobi");
        testCar.moveForward();
        assertThat(testCar.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차 초기값 위치 테스트")
    void 자동차_초기_위치() {
        Car testCar = new Car("pobi");
        assertThat(testCar.getPosition()).isEqualTo(0);
    }
}