package org.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by lvguojun
 *
 * @Author: lvguojun
 * @Description:
 * @Date Created in 下午1:44 18/3/29
 */

public class Provider {
    public static void main(String[] args) throws IOException {
        //加载spring文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-provider.xml"});
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
