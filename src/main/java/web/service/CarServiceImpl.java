package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCarList(int count) {
        if (count >= 5) {
            return carDao.getCarList();
        }
        return carDao.getCarList(count);
    }
}
