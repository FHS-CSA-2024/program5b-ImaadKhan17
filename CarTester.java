
import java.util.Scanner;
public class CarTester{
    public static void main(String args[]){
    Car car1 = addCar();
    System.out.println(car1.toString());
    Car car2 = addCar();
    System.out.println(car2.toString());

    }
    public static Car addCar(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Car Name: ");
        String carName = myScanner.nextLine();
        System.out.println("Enter Miles Driven: ");
        double carMiles = myScanner.nextDouble();
        System.out.println("Enter Gallons Used: ");
        double carGallons = myScanner.nextDouble();

        return new Car(carName, carMiles, carGallons);
    }
}
