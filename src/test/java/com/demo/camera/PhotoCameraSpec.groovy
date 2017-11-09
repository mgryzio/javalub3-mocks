package com.demo.camera
import spock.lang.Specification
class PhotoCameraSpec extends Specification {

    def "Should power up the sensor when camera is switched on"() {
        given:
        ImageSensor sensor = Mock(ImageSensor)
        PhotoCamera camera = new PhotoCamera(sensor)

        when:
        camera.turnOn()

        then:
        1* sensor.turnOn()

    }

    def "Should power down the sensor when camera is switched off"(){
        given:
        ImageSensor sensor = Mock(ImageSensor)
        PhotoCamera camera = new PhotoCamera(sensor)

        when:
        camera.turnOff()

        then:
        1* sensor.turnOff()
    }

    def "Press the button when power off doing nothing"(){
        given:
        ImageSensor sensor = Mock(ImageSensor)
        PhotoCamera camera = new PhotoCamera(sensor)
        camera.pressButton()

        when:
        camera.turnOff()

        then:
        0*camera.pressButton()
    }

}