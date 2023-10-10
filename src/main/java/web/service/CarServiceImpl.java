package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList;

    @Override
    public void initializeCarList() {
         carList = Arrays.asList(
                new Car("Tesla", "X", 100_000),
                new Car("Mercedes", "E", 90_000),
                new Car("Mercedes", "S", 130_000),
                new Car("Jiguli", "5", 3_000),
                new Car("Moskvich", "3", 25_000)
        );
    }

    @Override
    public List<Car> getCarList() {
        initializeCarList();
        return carList;
    }
}
