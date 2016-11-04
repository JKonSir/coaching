package com.tsc.main;

import com.tsc.configuration.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application
{
    public static void main(String[] args)
    {
        System.setProperty("javax.xml.bind.context.factory","org.eclipse.persistence.jaxb.JAXBContextFactory");
        ConfigurableApplicationContext ctx = SpringApplication.run(AppConfig.class);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames)
        {
            System.out.println(beanName);
        }
    }

}
