package ca.mibank;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {

    private final AtomicLong counter = new AtomicLong();
    private final String template = "Hello to %s!";

    public Greeting greet(String personName) {
        return new Greeting(counter.incrementAndGet(), String.format(template, personName));
    }
}
