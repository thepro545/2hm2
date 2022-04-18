package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("car99", 0);
        Car car2 = new Car("bar55", 99);
        car.setModelName("car1");
        car2.setModelName("car2");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck("trick50", 80);
        Truck truck2 = new Truck("trock238765", 876543);
        truck.setModelName("truck1");
        truck2.setModelName("truck2");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        Bicycle bicycle = new Bicycle("boxiclo", 44);
        Bicycle bicycle2 = new Bicycle("unboxing", 2022);
        bicycle.setModelName("bicycle1");
        bicycle2.setModelName("bicycle2");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        ServiceStation serviceStationForWorkers = new ServiceStationForWorkers();
        ServiceStation serviceStationForGuests = new ServiceStationForGuests();

        print(serviceStationForWorkers, car, bicycle, truck);
        print(serviceStationForWorkers, car2, bicycle2, truck2);

        print(serviceStationForGuests, car, null, null);
        print(serviceStationForGuests, car2, null, null);
        print(serviceStationForGuests, null, bicycle, null);
        print(serviceStationForGuests, null, bicycle2, null);
        print(serviceStationForGuests, null, null, truck);
        print(serviceStationForGuests, null, null, truck2);

    }

    public static void print(ServiceStation serviceStation, Car car, Bicycle bicycle, Truck truck) {
        serviceStation.check(car);
        serviceStation.check(bicycle);
        serviceStation.check(truck);
    }

}