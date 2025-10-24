package racingcar.model;

public class CarValidator {
    public static void validateCarName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }

        if (name.isBlank()) {
            throw new IllegalArgumentException("공백 이름은 불가능합니다");
        }
    }
}
