package org.apache.dubbo.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboDemoBootConsumerApplication {

    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(DubboDemoBootConsumerApplication.class, args)));
    }

}
