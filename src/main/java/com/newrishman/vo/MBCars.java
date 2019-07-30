package com.newrishman.vo;

public class MBCars {
    int id;
    String Body;
    int Engine;
    String Model;
    int VIN;

    public void setId(int id) {
        this.id = id;
    }

    public void setBody(String body) {
        Body = body;
    }

    public void setEngine(int engine) {
        Engine = engine;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return Body;
    }

    public int getEngine() {
        return Engine;
    }

    public String getModel() {
        return Model;
    }

    public int getVIN() {
        return VIN;
    }

    @Override
    public String toString() {
        return "\t" + "Body: '" + Body + '\'' +
                ", Engine: " + Engine +
                ", Model: '" + Model + '\'' +
                ", VIN: " + VIN + "\n";
    }
}
