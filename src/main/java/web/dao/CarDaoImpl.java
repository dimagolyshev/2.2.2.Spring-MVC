package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private final List<Car> garage = new ArrayList<>();

    public CarDaoImpl() {
        garage.add(new Car("Model1", 1, 2001));
        garage.add(new Car("Model2", 2, 2002));
        garage.add(new Car("Model3", 3, 2003));
        garage.add(new Car("Model4", 4, 2004));
        garage.add(new Car("Model5", 5, 2005));
    }

    @Override
    public List<Car> getCarList() {
        return Collections.unmodifiableList(garage);
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count <= 0) {
            return List.of();
        }
        return List.copyOf(garage.subList(0, count));
    }
}
