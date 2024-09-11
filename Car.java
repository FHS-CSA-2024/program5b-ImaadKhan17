
public class Car{
    private String carName;
    private double milesDriven;
    private double gallonsUsed;

    public Car(){
        carName = "";
        milesDriven = 0;
        gallonsUsed = 0;
    }
    public Car(String name, double miles, double gallons){
        carName = name;
        milesDriven = miles;
        gallonsUsed = gallons;
    }

    public void setName(String name){
        this.carName = name;
    }
    public void setMiles(double miles){
        this.milesDriven = miles;
    }
    public void setGallons(double gallons){
        this.gallonsUsed = gallons;
    }

    public String getName(){
        return carName;
    }
    public double getMiles(){
        return milesDriven;
    }
    public double getGallons(){
        return gallonsUsed;
    }

    public double calculateAverage(){
        return Math.round((milesDriven/gallonsUsed)*10)/10;
    }

    public String toString(){
        return carName + " averaged " + calculateAverage() + " m/gal" ;
    }

}
