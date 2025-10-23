package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.List;

public class RacingGame {

    public void playRound(List<Car> cars) {
        cars.forEach((car) -> {
            attemptToMove(car);
            System.out.println(car);
        });
        System.out.println();
    }

    public void attemptToMove(Car car) {
        int randomNumber = generateRandomNumber();
        // 임시 확인용
        System.out.println("랜덤 값" + randomNumber);

        if (randomNumber < 4) {
            return;
        }
        car.moveForward();
    }

    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
