package racingcar.view;

import java.util.List;
import racingcar.model.Car;

public class OutputView {
    // 게임 진행 중 출력
    public void printCarPosition(Car car) {
        System.out.println(car);
    }

    // 우승자 출력
    public void printWinner(List<String> winners) {
        String winnerMessage = String.join(", ", winners);

        System.out.print("최종 우승자 : " + winnerMessage);
    }
}
