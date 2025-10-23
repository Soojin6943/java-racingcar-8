package racingcar;

public class Car {
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    @Override
    public String toString() {
        return name + " " + position;
    }
}
