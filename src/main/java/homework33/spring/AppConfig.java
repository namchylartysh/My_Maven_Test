package homework33.spring;

import homework33.BlackWhiteCameraRoll;
import homework33.Camera;
import homework33.CameraRoll;
import homework33.ColorCameraRoll;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CameraRoll colorCameraRoll() {
        return new ColorCameraRoll();
    }

    @Bean
    public CameraRoll bwCameraRoll() {
        return new BlackWhiteCameraRoll();
    }

    @Bean
    public Camera camera(CameraRoll colorCameraRoll) {
        Camera camera = new Camera();
        camera.setCameraRoll(colorCameraRoll);
        return camera;
    }
}
