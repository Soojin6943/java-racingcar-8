package racingcar;

import java.util.List;

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
