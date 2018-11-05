public class Plane extends Vehicle implements Flyable {

boolean hasWings = true;

    @Override
    public void canFly(boolean hasWings) {
        System.out.println("You can fly ");
    }

    @Override
    public void isLanding() {
        System.out.println("The Plane is landing");
    }

    @Override
    public void isFlying() {
        System.out.println("The Plane is flying");
    }
}