package org.dubbo.consumer;

import org.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lvguojun
 *
 * @Author: lvguojun
 * @Description:
 * @Date Created in 下午1:57 18/3/29
 */

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();
        System.out.println("consumer start");
        DemoService demoService = (DemoService) context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }
}
