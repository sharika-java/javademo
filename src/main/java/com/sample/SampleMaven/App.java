package com.sample.SampleMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		//ApplicationContext context = new ClassPathXmlApplicationContext("mybeanDef.xml");
        //SpringCls_B obj = context.getBean(SpringCls_B.class);
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Mybeanconfig.class);
        SpringCls_A obj = context.getBean(SpringCls_A.class);
        obj.add();
    }
}
