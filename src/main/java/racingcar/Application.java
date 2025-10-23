package racingcar;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        String carsName = inputView.readCarName();

        // 임시 실행 테스트
        System.out.println(carsName);
    }
}
