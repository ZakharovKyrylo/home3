//package home03;
//
//import java.util.Random;
//
//public class Task3 {
//
//    public static void main(String[] args) {
//
//        Dispatcher1.dispatcher();
//
//
//    }
//}
//
//class Dispatcher1{
//
//   static String removedDriver=null;
//   static String removedCar=null;
//
//   static void dispatcher(){
//
//       Random Rand = new Random();
//       Dispatcher trip = new Dispatcher();
//
//       String driverName;
//       String tripName;
//       String carName;
//
//
//        String name=null; //выбор диспетчера
//        switch (Rand.nextInt(5)){
//            case 0 : name=" NameDispatcher0 " ; break;
//            case 1 : name=" NameDispatcher1 " ; break;
//            case 2 : name=" NameDispatcher2 " ; break;
//            case 3 : name=" NameDispatcher3 " ; break;
//            case 4 : name=" NameDispatcher4 " ; break;
//            case 5 : name=" NameDispatcher5 " ; break;
//        }
//        if(Rand.nextInt(100)>=50) removedDriver =  trip.choseDriver(Rand.nextInt(5));  //исключаем водител€
//
//       while (true){
//           driverName =  trip.choseDriver(Rand.nextInt(5)); // выбор водител€
//           // провер€ем, водитель отсранен или нет
//           if(driverName != removedDriver){
//               break;
//           }
//       }
//
//       tripName = trip.choseTrip(Rand.nextInt(5)); // выбор маршрута
////       carName = trip.choseCar(Rand.nextInt(5)); // выбор машини
//
//       while (true){
//           carName = trip.choseCar(Rand.nextInt(5)); // выбор машини
//           // провер€ем, водитель отсранен или нет
//           if(driverName != removedCar){
//               break;
//           }
//       }
//
//       System.out.println("Dispatcher " + name + " Chose driver" + driverName + " for trip " + tripName + " on " + carName);
//
//
//
//
//    }
//
//    private String choseDriver(int num){
//        Dispatcher car = new Dispatcher();
//        Random Rand = new Random();
//        String name=null;
//        switch (num){
//            case 0 : name=" NameDriver0 " ; break;
//            case 1 : name=" NameDriver1 " ; break;
//            case 2 : name=" NameDriver2 " ; break;
//            case 3 : name=" NameDriver3 " ; break;
//            case 4 : name=" NameDriver4 " ; break;
//            case 5 : name=" NameDriver5 " ; break;
//        }
//        if(Rand.nextInt(100)<=50) removedCar = car.choseDriver(Rand.nextInt(5));  //исключаем водител€
//        return name;
//    }
//
//    private String choseTrip(int num){
//
//        String name=null;
//        switch (num){
//            case 0 : name=" Trip0 " ; break;
//            case 1 : name=" Trip1 " ; break;
//            case 2 : name=" Trip2 " ; break;
//            case 3 : name=" Trip3 " ; break;
//            case 4 : name=" Trip4 " ; break;
//            case 5 : name=" Trip5 " ; break;
//        }
//        return name;
//    }
//
//    private String choseCar(int num){
//        String name=null;
//        switch (num){
//            case 0 : name=" Car0 " ; break;
//            case 1 : name=" Car1 " ; break;
//            case 2 : name=" Car2 " ; break;
//            case 3 : name=" Car3 " ; break;
//            case 4 : name=" Car4 " ; break;
//            case 5 : name=" Car5 " ; break;
//        }
//        return name;
//    }
//}
