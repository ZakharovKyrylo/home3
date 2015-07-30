package home03;

import java.util.Random;

public class Task3_1 {
    public static void main(String[] args) {
        Trip trip = new Trip();
        Random Rand = new Random();
        Dispatcher.dispatcher(Rand.nextInt(5));//выбор деспетчера


        String tripName;
        tripName = trip.choseTrip(Rand.nextInt(5)); // выбор маршрута

    }
}


//
class Dispatcher {

    static int choseDispatcher;
    Dispatcher(int num){
        choseDispatcher = num;
    }

    static void dispatcher(int i) {
        Task3_1 task = new Task3_1();
        Random Rand = new Random();
        Driver driver = new Driver();
        Car car = new Car();
        Trip trip = new Trip();

        String driverName;

        String carName;

        String removedDriver = null;
        String removedCar = null;

        String name = null; //выбор диспетчера
        switch (choseDispatcher) {
            case 0:                name = " NameDispatcher0 ";                break;
            case 1:                name = " NameDispatcher1 ";                break;
            case 2:                name = " NameDispatcher2 ";                break;
            case 3:                name = " NameDispatcher3 ";                break;
            case 4:                name = " NameDispatcher4 ";                break;
            case 5:                name = " NameDispatcher5 ";                break;
        }
        if (Rand.nextInt(100) >= 50) removedDriver = driver.choseDriver(Rand.nextInt(5));  //исключаем водителя

        while (true) {
            driverName = driver.choseDriver(Rand.nextInt(5)); // выбор водителя
            // проверяем, водитель отсранен или нет
            if (driverName != removedDriver) {
                break;
            }
        }



        while (true) {
            carName = car.choseCar(Rand.nextInt(5)); // выбор машини
            // проверяем, водитель отсранен или нет
            if (driverName != removedCar) {
                break;
            }
        }


        System.out.println("Dispatcher " + name + " Chose driver" + driverName + " for trip " +  " on " + carName);

        removedCar=driver.work();
        System.out.println("driver " + driverName + " has done his work, and car " + carName + removedCar ); //отчет о работе

    }
}

class Driver{
    Car car = new Car();
    String choseDriver(int num){
        String name=null;
        switch (num){
            case 0 : name=" NameDriver0 " ; break;
            case 1 : name=" NameDriver1 " ; break;
            case 2 : name=" NameDriver2 " ; break;
            case 3 : name=" NameDriver3 " ; break;
            case 4 : name=" NameDriver4 " ; break;
            case 5 : name=" NameDriver5 " ; break;
        }
        return name;
    }
    String work(){
        for (int i=0;i<100;i++){}//водитель работает
        Random random = new Random();
        if(random.nextInt(100)<50){//поломка автомобиля
            return " has easy wear ";}
        else if(random.nextInt(100)<75){
            return " has average wear ";}
        else return (" has broken ");
    }
}


class Car{
    String choseCar(int num){
        String name=null;
        switch (num){
            case 0 : name=" Car0 " ; break;
            case 1 : name=" Car1 " ; break;
            case 2 : name=" Car2 " ; break;
            case 3 : name=" Car3 " ; break;
            case 4 : name=" Car4 " ; break;
            case 5 : name=" Car5 " ; break;
        }
        return name;
    }
}

class Trip{
    String choseTrip(int num){
        String name=null;
        switch (num){
            case 0 : name=" Trip0 " ; break;
            case 1 : name=" Trip1 " ; break;
            case 2 : name=" Trip2 " ; break;
            case 3 : name=" Trip3 " ; break;
            case 4 : name=" Trip4 " ; break;
            case 5 : name=" Trip5 " ; break;
        }
        return name;
    }
}