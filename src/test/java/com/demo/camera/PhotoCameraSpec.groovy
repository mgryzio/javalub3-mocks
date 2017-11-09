package com.demo.camera

import spock.lang.Specification

class PhotoCameraSpec extends Specification {

    def "Should power up the sensor when camera is switched on"() {
        given:
        ImageSensor sensor = Mock(ImageSensor)
        Card card = Mock(Card)
        PhotoCamera camera = new PhotoCamera(sensor, card)

        when:
        camera.turnOn()

        then:
        1 * sensor.turnOn()
    }

    def "Should power down the sensor when camera is switched off"() {
        given:
        ImageSensor sensor = Mock(ImageSensor)
        Card card = Mock(Card)
        PhotoCamera camera = new PhotoCamera(sensor, card)

        when:
        camera.turnOff()

        then:
        1 * sensor.turnOff()
    }

    def "Press the button when power off doing nothing"() {
        given:
        ImageSensor sensor = Mock(ImageSensor)
        Card card = Mock(Card)
        PhotoCamera camera = new PhotoCamera(sensor, card)
        camera.turnOff()
        assert !camera.on

        when:
        camera.pressButton()

        then:
        0 * sensor.turnOn()
        0 * sensor.turnOff()
        0 * sensor.read()
    }

    def "When you press the button, camera copies dates from memory card"() {
        given:
        ImageSensor sensor = Mock(ImageSensor)
        Card card = Mock(Card)
        PhotoCamera camera = new PhotoCamera(sensor, card)
        camera.turnOn()
        assert camera.on

        when:
        camera.pressButton()

        then:
        1 * card.write()
    }

}