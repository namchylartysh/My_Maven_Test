package homework33.crane;

import org.springframework.context.annotation.Bean;

public class Application {
    @Bean
    public LeverOne leverOne() {
        return new LeverOne();
    }

    @Bean
    public LeverTwo leverTwo() {
        return new LeverTwo();
    }

    @Bean
    public Signal setUp() {
        return new Signal();
    }

    @Bean
    public Signal signal(Action action) {
        Signal signal = new Signal();
        signal.startAction(signal);
        return signal;
    }
}
