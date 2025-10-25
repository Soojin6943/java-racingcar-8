package racingcar.model;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RacingGameTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 랜덤_전진_테스트() {
        Car car = new Car("pobi");
        RacingGame racingGame = new RacingGame();

        assertRandomNumberInRangeTest(
                () -> {
                    racingGame.attemptToMove(car);
                    assertThat(car.getPosition()).isEqualTo(1);
                }, MOVING_FORWARD
        );
    }

    @Test
    void 랜덤_멈춤_테스트() {
        Car car = new Car("pobi");
        RacingGame racingGame = new RacingGame();

        assertRandomNumberInRangeTest(
                () -> {
                    racingGame.attemptToMove(car);
                    assertThat(car.getPosition()).isEqualTo(0);
                }, STOP
        );
    }
}