package com.tsc.configuration;

import com.tsc.controllers.HelloController;
import com.tsc.logics.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.tsc.controllers")
public class AppConfig
{
    @Bean
    public HelloController helloController()
    {
        return new HelloController();
    }

    @Bean
    public WriteFile writeFile()
    {
        return new WriteFile();
    }

    @Bean
    public ReadFile readFile()
    {
        return new ReadFile();
    }

    @Bean
    public MarshallService marshallingService()
    {
        return new JsonService();
    }

}
