package homework33.crane;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CraneOperator {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CraneOperator.class);
        Signal signal = context.getBean("signal", Signal.class);
        LeverTwo leverTwo = context.getBean("leverTwo", LeverTwo.class);
        signal.startAction(signal.getUp());
    }

}
