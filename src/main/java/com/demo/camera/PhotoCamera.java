package com.demo.camera;

public class PhotoCamera implements WriteListener {

    ImageSensor sensor;
    Card card;
    WriteListener completed;
    boolean on;

    public PhotoCamera(ImageSensor sensor, Card card) {
        this.card = card;
        this.sensor = sensor;
    }

    public void turnOn() {
        sensor.turnOn();
        on = true;
    }

    public void turnOff() {
        sensor.turnOff();
        on = false;
    }

    public void pressButton() {
        if (on) {
            card.write(sensor.read());
            
        } else {}
    }

    @Override
    public void writeCompleted() {

    }
}

