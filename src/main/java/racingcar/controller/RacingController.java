package racingcar.controller;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.model.RacingGame;

public class RacingController {
    public void run() {
        InputView inputView = new InputView();
        Cars cars = new Cars();
        RacingGame racingGame = new RacingGame();
        OutputView outputView = new OutputView();

        // 자동차 이름 및 시도 횟수 받기
        String carsName = inputView.readCarName();
        int tryCount = inputView.readTryCount();

        System.out.println("실행 결과");
        // 차동차 이름 -> Car 리스트로 변환
        List<Car> carList = cars.carParser(carsName);

        // 시도 횟수만큼 레이스 진행
        racingGame.startRace(tryCount, carList);

        // 우승자 구하기
        int maxPosition = cars.maxPosition(carList);
        List<String> winners = cars.winner(carList, maxPosition);
        outputView.printWinner(winners);
    }
}
