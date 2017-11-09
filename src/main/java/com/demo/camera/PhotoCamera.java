package com.demo.camera;

public class PhotoCamera implements WriteListener{

    ImageSensor sensor;

    public PhotoCamera(ImageSensor sensor){
        this.sensor=sensor;
    }

    public void turnOn() {
        sensor.turnOn();
    }

    public void turnOff() {
        sensor.turnOff();
    }

    public void pressButton() {

    }

    @Override
    public void writeCompleted() {

    }
}

