package racingcar;

import java.util.Arrays;
import java.util.List;

public class Cars {

    public List<Car> carParser(String carsName) {
        return Arrays.stream(carsName.split(","))
                .map(Car::new)
                .toList();
    }
}
