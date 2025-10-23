package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import racingcar.view.OutputView;

public class RacingGame {
    OutputView outputView = new OutputView();

    // 레이스 시작 (시행 횟수만큼 라운드 진행)
    public void startRace(int tryCount, List<Car> cars) {
        for (int i = 0; i < tryCount; i++) {
            playRound(cars);
        }
    }

    // 라운드 진행 (자동차들이 한 번씩 랜덤 전진 시도)
    public void playRound(List<Car> cars) {
        cars.forEach((car) -> {
            attemptToMove(car);
            outputView.printCarPosition(car);
        });
        System.out.println();
    }

    // 랜덤 전진 시도
    public void attemptToMove(Car car) {
        int randomNumber = generateRandomNumber();

        if (randomNumber < 4) {
            return;
        }
        car.moveForward();
    }

    // 랜덤 수 생성
    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
