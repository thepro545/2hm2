package ru.skypro;

public class ServiceStationForGuests implements ServiceStation {
    @Override
    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            waiting();
            ready();
        }
    }

    @Override
    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            waiting();
            ready();
        }
    }

    @Override
    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            waiting();
            ready();
        }
    }


    public void waiting() {
        System.out.println("Пожалуйста, ожидайте");
    }
    @Override
    public void ready(){
        System.out.println("Обслуживание завершено. Можно забрать свой транспорт");
    }
}
