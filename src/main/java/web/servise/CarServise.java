package web.servise;

import web.Model.Car;

import java.util.List;

public interface CarServise {
    public List<Car> getCars();
    public List<Car> cars(int n);
}
