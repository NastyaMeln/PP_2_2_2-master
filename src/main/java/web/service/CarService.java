package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private List<Car> carList = new ArrayList<>();

    public CarService() {
        carList.add(new Car(1, "Ауди", 10));
        carList.add(new Car(2, "Audi2", 20));
        carList.add(new Car(3, "Audi3", 30));
        carList.add(new Car(4, "Audi4", 40));
        carList.add(new Car(5, "Audi5", 50));
    }

    public List<Car> getCars(int count) {
        if (count > 5) count = 5;
        return carList.subList(0, count);
    }
}
