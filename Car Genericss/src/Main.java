import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Create instances of different part types
        Tyre tyreSpecs = new Tyre("spandor","Apollo","Medium");
        Seat seatSpecs = new Seat ("Height Measuring tap,Weight measuring machine","32-inch","30-35 pounds");
        Door doorSpecs = new Door("Spray paint","Black","Volvo");

        // Create a car
         Car<Part<?>> car= new Car<>();
        // Add parts to the car
        car.addPart(tyreSpecs);
        car.addPart(seatSpecs);
        car.addPart(doorSpecs);

        List <Car<Part<?>>> cars;
        cars = new ArrayList<>();
        cars.add(car);
        // Print the contents of the car
        System.out.println("Parts in the car \uD83D\uDE97 ");


           // car.displayCar();
        car.displayAllParts();
        car.removePart(tyreSpecs);
        car.displayAllParts();
        car.removePart(doorSpecs);
        car.displayAllParts();
        car.addPart(tyreSpecs);
        car.displayAllParts();
        car.addPart(doorSpecs);
        car.displayAllParts();


    }
}