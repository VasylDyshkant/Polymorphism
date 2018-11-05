public class Vehicle implements Movable{
   private Vehicle vehicleType;

    public void setVehicleType (Vehicle vehicleType){
        this.vehicleType = vehicleType;
    }

    @Override
    public void turnTheEngineOn() {
        System.out.println("Turning the engine on.... ");
    }

    @Override
    public void turnTheEngineOff() {
        System.out.println("The engine is off!");
    }


    @Override
    public void move(Vehicle vehicleType) {

        System.out.printf("The %s is starting to move......\n",vehicleType);
        System.out.printf("The %s is moving......\n",vehicleType);

    }

    @Override
    public void stop(Vehicle vehicleType) {

        System.out.printf("The %s stopped moving!\n",vehicleType);

    }

    @Override
    public String toString() {
        return vehicleType.getClass().getName();
    }
}
