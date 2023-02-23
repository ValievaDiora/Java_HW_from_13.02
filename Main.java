public class Main {
    public static void main(String[] args) {

        ParkingPlace parkingPlace1 = new ParkingPlace();
        parkingPlace1.numer = 9;
        parkingPlace1.isOccupied = " - занято";

        ParkingPlace parkingPlace2 = new ParkingPlace();
        parkingPlace2.numer = 11;
        parkingPlace2.isOccupied = " - занято";

        ParkingPlace parkingPlace3 = new ParkingPlace();
        parkingPlace3.numer = 13;
        parkingPlace3.isOccupied = " - не занято";

        System.out.println(parkingPlace1.printPlaceInfo());
        System.out.println(parkingPlace2.printPlaceInfo());
        System.out.println(parkingPlace3.printPlaceInfo());
    }

}