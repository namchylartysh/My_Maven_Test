package homework33.crane;

public class LeverOne implements Action {

    @Override
    public void forward() {
        System.out.println("кран опускает вниз");
    }

    @Override
    public void back() {
        System.out.println("кран поднимает вверх");
    }
}
