package com.suman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Dev obj = context.getBean(Dev.class);
//        obj.setAge(21);

        //System.out.println(obj.getAge());
        obj.build();
    }
}
