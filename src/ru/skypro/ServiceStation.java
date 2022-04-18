package ru.skypro;

public interface ServiceStation  {
    void check(Car car);

    void check(Truck truck);

    void check(Bicycle bicycle);

    void ready();
}
