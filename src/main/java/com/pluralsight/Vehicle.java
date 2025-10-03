package com.pluralsight;

public class Vehicle {


    // Class variables
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;


    //Constructor Method


    public Vehicle(long vehicleId, String color, String makeModel, int odometerReading, float price) {
        this.color = color;
        this.makeModel = makeModel;
        this.odometerReading = odometerReading;
        this.price = price;
        this.vehicleId = vehicleId;
    }






    //Getters and setters

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }








    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }








    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }










    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }












    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
