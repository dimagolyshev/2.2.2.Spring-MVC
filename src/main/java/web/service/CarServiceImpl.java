package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.CarGarage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarGarage carGarage;

    @Override
    public List<Car> getCarList(int carNumber) {

        if (carNumber >= 5) {
            return carGarage.getGarage();
        }

        List<Car> resultList = new ArrayList<>();
        List<Car> garage = carGarage.getGarage();
        IntStream.range(0, carNumber)
                .forEach(i -> resultList.add(garage.get(i)));
        return resultList;
    }
}
