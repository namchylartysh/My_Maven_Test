package homework33.crane;

public class LeverTwo implements Action {
    @Override
    public void forward() {
        System.out.println("поворачивает влево");
    }

    @Override
    public void back() {
        System.out.println("поворачивает вправо");
    }
}
