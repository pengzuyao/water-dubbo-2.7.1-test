package com.pzy.study.consumer;


import com.pzy.study.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-27
 */
public class Consumer {

    public static void main(String[] args) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        HelloService helloService = context.getBean("helloService", HelloService.class);
        for (int i = 0; i < 10000; i++) {
            System.out.println(helloService.sayHello("pzy"));
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
