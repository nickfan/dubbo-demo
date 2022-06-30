package org.apache.dubbo.demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppStartupRunner implements ApplicationRunner {
    @Autowired
    private DemoServiceComponent demoServiceComponent;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Application started with option names : {}",
                args.getOptionNames());

        String hello = demoServiceComponent.sayHello("world");
        System.out.println("result :" + hello);
        log.info("result : " + hello);
    }
}