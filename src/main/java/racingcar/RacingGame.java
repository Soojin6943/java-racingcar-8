package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingGame {
    // 자동차 하나씩 진행
    // 랜덤 숫자 받아야 함
    // 랜덤 숫자가 4 이상이면 전진
    public void attemptToMove(Car car) {
        int randomNumber = generateRandomNumber();
        // 임시 확인용
        System.out.println(randomNumber);

        if (randomNumber < 4) {
            return;
        }
        car.moveForward();
    }

    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
