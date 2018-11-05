public class MathodMain {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.setVehicleType(car);
        car.turnTheEngineOn();
        ((Car) car).turnTheLightsOn();
        car.move(car);
        car.stop(car);
        ((Car) car).turnTheLightsOff();
        car.turnTheEngineOff();
        System.out.println();

        Vehicle sportCar = new SportCar();
        sportCar.setVehicleType(sportCar);
        System.out.println("The color of the sport car is "+ ((SportCar) sportCar).getCOLOR());
        ((SportCar) sportCar).fast();
        System.out.println();

        Vehicle bicycle = new Bicycle();
        bicycle.setVehicleType(bicycle);
        System.out.println("This bicycle has "+((Bicycle) bicycle).getWHEELS()+" wheels");
        bicycle.move(bicycle);
        bicycle.stop(bicycle);
        System.out.println();

        Vehicle plane2 = new Plane();
        plane2.setVehicleType(plane2);
        plane2.move(plane2);
        ((Plane) plane2).canFly(((Plane) plane2).hasWings);
        ((Plane) plane2).isFlying();
        plane2.turnTheEngineOff();
        ((Plane) plane2).isLanding();
        System.out.println("HaHa:)");

    }


}
