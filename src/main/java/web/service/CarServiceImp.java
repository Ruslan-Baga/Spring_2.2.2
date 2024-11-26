package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCar(int value) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "M", 5));
        list.add(new Car("Audi", "Q", 8));
        list.add(new Car("Lada", "Priora", 2170));
        list.add(new Car("Volvo", "SX", 406));
        list.add(new Car("Lexus", "RX", 500));


        return list.stream().limit(value).toList();
    }
}

