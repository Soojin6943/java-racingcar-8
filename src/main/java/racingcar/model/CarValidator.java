package racingcar.model;

public class CarValidator {
    private static final String ERRER_MESSEGE = "자동차 이름은 1자 이상, 5자 이하만 가능합니다.";

    public static void validateCarName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ERRER_MESSEGE);
        }

        if (name.isBlank()) {
            throw new IllegalArgumentException(ERRER_MESSEGE);
        }
    }
}
