package homework33;

public class Camera {
    private CameraRoll cameraRoll;

//    public Camera(CameraRoll cameraRoll) {  внедрение зависимости через constructor
//        this.cameraRoll = cameraRoll;
//    }
//
//    public CameraRoll getCameraRoll() {
//        return cameraRoll;
//    }

    public void setCameraRoll(CameraRoll cameraRoll) { // внедрение зависимости через setter
        this.cameraRoll = cameraRoll;
    }

    public void makePhoto() {
        System.out.println("Click!");
        cameraRoll.processing();
    }
}
