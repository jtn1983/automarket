import java.util.ArrayList;
import java.util.List;

public class Shop {
    Producer producer = new Producer(this);
    List<Car> cars = new ArrayList<>(10);

    public Car sellCar(int time) {
        return producer.sellCar(time);
    }

    public void produceCar(int time) {
        producer.produceCar(time);
    }

    List<Car> getCars() {
        return cars;
    }

}
