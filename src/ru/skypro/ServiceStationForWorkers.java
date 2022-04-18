package ru.skypro;

public class ServiceStationForWorkers implements ServiceStation {


    public void ready(){

    }
    @Override
    public void check(Car car){
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            System.out.println("Все покрышки установлены");
            car.checkEngine();
            System.out.println("Двигатель успешно проверен");
        }
    }
    @Override
    public void check(Truck truck){
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            System.out.println("Все покрышки установлены");
            truck.checkEngine();
            System.out.println("Двигатель успешно проверен");
            truck.checkTrailer();
            System.out.println("Прицеп успешно проверен");
        }
    }
    @Override
    public void check(Bicycle bicycle){
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
            System.out.println("Все покрышки установлены");
        }
    }

}