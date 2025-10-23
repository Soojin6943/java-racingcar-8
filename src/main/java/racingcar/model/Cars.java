package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {

    // 입력받은 자동차들을 자동차 객체 리스트로 변환
    public List<Car> carParser(String carsName) {
        return Arrays.stream(carsName.split(","))
                .map(Car::new)
                .toList();
    }

    // 우승자 구하기
    public List<String> winner(List<Car> cars, int maxPosition) {
        ArrayList<String> winner = new ArrayList<>();

        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winner.add(car.getName());
            }
        }

        return winner;
    }

    // 제일 먼 전진 거리 구하기
    public int maxPosition(List<Car> cars) {
        int max = Integer.MIN_VALUE;

        for (Car car : cars) {
            if (max >= car.getPosition()) {
                continue;
            }
            max = car.getPosition();
        }

        return max;
    }
}
