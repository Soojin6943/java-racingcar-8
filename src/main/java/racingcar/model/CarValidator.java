package racingcar.model;

public class CarValidator {
    private static final String ERROR_MESSAGE = "자동차 이름은 1자 이상, 5자 이하만 가능합니다.";

    public static void validateCarName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }

        if (name.isBlank()) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }

    public static void validateComma(String carNames) {
        if (carNames.startsWith(",") || carNames.endsWith(",")) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }
}
