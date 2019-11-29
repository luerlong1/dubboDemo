package com.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();
        System.out.println("dubbo服务提供端已启动....");
        System.in.read(); // 按任意键退出

    }
}

