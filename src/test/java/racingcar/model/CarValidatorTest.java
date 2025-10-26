package racingcar.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class CarValidatorTest {

    @Test
    void 이름_5자_이하() {
        String carName = "javajigi";
        assertThatThrownBy(() -> CarValidator.validateCarName(carName))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름_공백_예외발생() {
        String carName = "     ";
        assertThatThrownBy(() -> CarValidator.validateCarName(carName))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 컴마로_입력_시작() {
        String carName = ", pobi";
        assertThatThrownBy(() -> CarValidator.validateComma(carName))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 컴마로_입력_종료() {
        String carName = "pobi,";
        assertThatThrownBy(() -> CarValidator.validateComma(carName))
                .isInstanceOf(IllegalArgumentException.class);
    }
}