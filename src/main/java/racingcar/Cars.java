package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {

    public List<Car> carParser(String carsName) {
        return Arrays.stream(carsName.split(","))
                .map(Car::new)
                .toList();
    }

    public List<String> winner(List<Car> cars, int maxPosition) {
        ArrayList<String> winner = new ArrayList<>();

        for (Car car : cars){
            if (car.getPosition() == maxPosition){
                winner.add(car.getName());
            }
        }

        return winner;
    }

    public int maxPosition(List<Car> cars){
        int max = Integer.MIN_VALUE;

        for (Car car : cars){
            if (max >= car.getPosition()){
                continue;
            }
            max = car.getPosition();
        }

        return max;
    }
}
