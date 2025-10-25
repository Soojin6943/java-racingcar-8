package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class CarsTest {

    @Test
    void 자동차_이름_문자열_객체_리스트로_변환() {
        Cars cars = new Cars();
        String carsName = "pobi, woni,jun";
        List<Car> carList = cars.carParser(carsName);

        assertThat(carList).hasSize(3);
        assertThat(carList.get(0).getName()).isEqualTo("pobi");
        assertThat(carList.get(1).getName()).isEqualTo("woni");
        assertThat(carList.get(2).getName()).isEqualTo("jun");
    }

    @Test
    void 단독_우승자_구하기() {
        Cars cars = new Cars();
        String carsName = "pobi, woni,jun";
        List<Car> carList = cars.carParser(carsName);

        carList.get(0).moveForward();
        int maxPosition = cars.maxPosition(carList);

        List<String> winner = cars.winner(carList, maxPosition);

        assertThat(winner.get(0)).isEqualTo("pobi");
    }

    @Test
    void 공동_우승자_구하기() {
        Cars cars = new Cars();
        String carsName = "pobi, woni,jun";
        List<Car> carList = cars.carParser(carsName);

        carList.get(0).moveForward();
        carList.get(1).moveForward();

        int maxPosition = cars.maxPosition(carList);

        List<String> winners = cars.winner(carList, maxPosition);

        assertThat(winners.get(0)).isEqualTo("pobi");
        assertThat(winners.get(1)).isEqualTo("woni");
    }

    @Test
    void 제일_먼_거리_구하기() {
        Cars cars = new Cars();
        String carsName = "pobi, woni,jun";
        List<Car> carList = cars.carParser(carsName);

        carList.get(0).moveForward();

        int maxPosition = cars.maxPosition(carList);
        assertThat(maxPosition).isEqualTo(1);
    }
}