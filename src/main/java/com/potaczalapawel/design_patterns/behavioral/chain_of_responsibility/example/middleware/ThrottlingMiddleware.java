package com.potaczalapawel.design_patterns.behavioral.chain_of_responsibility.example.middleware;

/**
 * ConcreteHandler. Checks whether there are too many failed login requests.
 */
public class ThrottlingMiddleware extends Middleware {
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    public  boolean check(String email, String password) {
        if(System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if(request > requestPerMinute) {
            long timeToRetryLogin = 60_000 + currentTime - System.currentTimeMillis();
            System.out.println("Request limit exceeded! Try again for " + timeToRetryLogin / 1_000 + " sec.");
            return false;
        }
        return checkNext(email, password);
    }
}
