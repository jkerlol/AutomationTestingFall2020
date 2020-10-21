public class Car {

    private String userID;
    private int birthday;

    public void honk() {
        System.out.println("The car has now honked!");
    }

    public void brake() {
        System.out.println("The car has now stopped!");
    }

    public void gas() {
        System.out.println("The car has now started to move. Remember to follow the speed limit!");
    }

    public void change_gear() {
        System.out.println("We have now changed gears, where will you go next?");
    }

    public void sideview() {
        System.out.println("Theres a giant truck coming beside you trying to cut you off!");
    }

    public void accelerate() {
        System.out.println("You're starting to accelerate! You're going " + mph + "miles per hour so make sure you're seatbelts fastened!");
    }

    public void getBrand() {
        System.out.println("Wow I love you're brand new " + brand);
    }
}
