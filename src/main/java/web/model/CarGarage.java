package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarGarage {

    private final List<Car> garage = new ArrayList<>();

    public CarGarage() {
        garage.add(new Car("Model1", 1, 2001));
        garage.add(new Car("Model2", 2, 2002));
        garage.add(new Car("Model3", 3, 2003));
        garage.add(new Car("Model4", 4, 2004));
        garage.add(new Car("Model5", 5, 2005));
    }

    public List<Car> getGarage() {
        return garage;
    }
}
