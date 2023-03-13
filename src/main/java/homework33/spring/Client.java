package homework33.spring;

import homework33.Camera;
import homework33.CameraRoll;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Camera camera = context.getBean("camera", Camera.class);
        CameraRoll bwCameraRoll = context.getBean("bwCameraRoll", CameraRoll.class);
        camera.makePhoto();

        camera.setCameraRoll(bwCameraRoll);
        camera.makePhoto();
    }
}
