package web.servise;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiseImpl implements CarServise{
    private List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car("Nissan", "Red", 523));
        cars.add(new Car("Toyota", "Grey", 798));
        cars.add(new Car("BMW", "Pink", 264));
        cars.add(new Car("Haval", "Blue", 938));
        cars.add(new Car("Hyundai", "Orange", 177));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> cars(int n) {
        if (n < 0){
            return new ArrayList<>();
        }
        if (n >= 5){
            return cars;
        } else {
            return cars.subList(0, n);
        }
    }
}
