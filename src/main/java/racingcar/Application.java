package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        Cars cars = new Cars();
        RacingGame racingGame = new RacingGame();

        String carsName = inputView.readCarName();
        int tryCount = inputView.readTryCount();

        List<Car> carList = cars.carParser(carsName);

        // 임시 실행 테스트
        System.out.println(carsName);
        System.out.println(tryCount);

        racingGame.startRace(tryCount, carList);
    }
}
