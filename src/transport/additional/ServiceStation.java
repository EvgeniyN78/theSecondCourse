package transport.additional;

import transport.transport.Car;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Car> {

    private String name;

    public ServiceStation(String name) {
        this.name = name;
    }

    private Queue<T> queue = new LinkedList<>();

    public void addTransport(T car) {
        queue.offer(car);
    }

    public void doService() {
        T car = queue.poll();
        if (car != null) {
            System.out.println("Автомобиль " + car.getBrand() + car.getBrand() + " проходит диагностику на СТО " + name);
            doService();
        } else {
            System.out.println("Все транспортные средства прошли диагностику.");
        }
    }

    public String getServiceStation() {
        return name;
    }
}