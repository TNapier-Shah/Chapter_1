package Bikes;

public class Bike {
    private int wheels;
    private String manu;
    private int year;
    private String type;

    public Bike(int wheels, String manu, int year, String type){
        this.wheels = wheels;
        this.manu = manu;
        this.year = year;
        this.type = type;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
