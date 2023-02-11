package app.model;

import org.springframework.stereotype.Component;

@Component("timer")
public class Timer extends Animal {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
    @Override
    public String toString() {
        return getTime().toString();
    }
}
