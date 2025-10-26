package racingcar.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TryCountValidatorTest {

    @Test
    void 시도_횟수가_0_이하() {
        assertThatThrownBy(() -> TryCountValidator.validateTryCount("-1"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 시도_횟수가_숫자가_아님() {
        assertThatThrownBy(() -> TryCountValidator.validateTryCount("five"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}