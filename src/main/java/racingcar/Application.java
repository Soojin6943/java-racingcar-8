package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        Cars cars = new Cars();
        RacingGame racingGame = new RacingGame();
        OutputView outputView = new OutputView();

        String carsName = inputView.readCarName();
        int tryCount = inputView.readTryCount();

        System.out.println("실행 결과");
        List<Car> carList = cars.carParser(carsName);

        racingGame.startRace(tryCount, carList);

        int maxPosition = cars.maxPosition(carList);
        List<String> winners = cars.winner(carList, maxPosition);
        outputView.printWinner(winners);
    }
}
