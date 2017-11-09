package com.demo.camera
import spock.lang.Specification
class PhotoCameraSpec extends Specification {

    def "Should power up the sensor when camera is switched on"() {
        given:
        ImageSensor camera = Mock(ImageSensor)
        camera.turnOn() >>
    }

}
