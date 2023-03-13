package homework33.crane;

public class Signal {
    private Signal up;
    private Signal down;
    private Signal left;
    private Signal right;


    public Signal getUp() {
        return up;
    }

    public Signal getDown() {
        return down;
    }

    public Signal getLeft() {
        return left;
    }

    public Signal getRight() {
        return right;
    }

    public void setUp(Signal up) {
        this.up = up;
    }

    public void setDown(Signal down) {
        this.down = down;
    }

    public void setLeft(Signal left) {
        this.left = left;
    }

    public void setRight(Signal right) {
        this.right = right;
    }

    private LeverOne leverOne;
    private LeverTwo leverTwo;

    public void setLeverOne(LeverOne leverOne) {
        this.leverOne = leverOne;
    }

    public void setLeverTwo(LeverTwo leverTwo) {
        this.leverTwo = leverTwo;
    }

    public void startAction(Signal signal) {
        if (signal.equals(up)) {
            leverTwo.forward();;
        }
        if (signal.equals(down)) {
            leverTwo.back();
        }
        if (signal.equals(left)) {
            leverOne.forward();
        }
        if (signal.equals(right)) {
            leverOne.back();
        }

    }
}
