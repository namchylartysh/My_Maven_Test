package homework33;

public class Client {
    public static void main(String[] args) {
        CameraRoll colorCameraRoll = new ColorCameraRoll();
        CameraRoll bwCameraRoll = new BlackWhiteCameraRoll();

        Camera camera = new Camera();
        camera.setCameraRoll(colorCameraRoll);
        camera.makePhoto();

        camera.setCameraRoll(bwCameraRoll);
        camera.makePhoto();
    }
}
