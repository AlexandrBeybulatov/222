package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarCount(Integer count) {

        if (count == null) {
            count = 0;
        }
        List<Car> carList = new ArrayList<>();

        carList.add(new Car(1, "bmw", "white"));
        carList.add(new Car(2, "ferrari", "red"));
        carList.add(new Car(3, "alfa", "green"));
        carList.add(new Car(4, "suzuki", "gray"));
        carList.add(new Car(5, "mazda", "gold"));

        if (count<5) {
            carList = carList.subList(0, count);
        }


        return carList;
    }
}
