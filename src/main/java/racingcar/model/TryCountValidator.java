package racingcar.model;

public class TryCountValidator {
    private static final String ERROR_MESSAGE = "시도 횟수는 1 이상의 숫자여야 합니다.";

    public static void validateTryCount(String input) {
        try {
            int tryCount = Integer.parseInt(input);
            if (tryCount <= 0) {
                throw new IllegalArgumentException(ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }
}
