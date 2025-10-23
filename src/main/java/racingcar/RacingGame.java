package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class RacingGame {
    OutputView outputView = new OutputView();

    public void startRace(int tryCount, List<Car> cars) {
        for (int i = 0; i < tryCount; i++) {
            playRound(cars);
        }
    }

    public void playRound(List<Car> cars) {
        cars.forEach((car) -> {
            attemptToMove(car);
            outputView.printCarPosition(car);
        });
        System.out.println();
    }

    public void attemptToMove(Car car) {
        int randomNumber = generateRandomNumber();

        if (randomNumber < 4) {
            return;
        }
        car.moveForward();
    }

    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
