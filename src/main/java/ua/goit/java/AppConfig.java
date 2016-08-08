package ua.goit.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by 7 on 31.07.2016.
 */
@Configuration
public class AppConfig {

    @Bean
    Runner runner() {
        Runner runner = new Runner();
        return runner;
    }

    @Bean
    LogAspect logAspect() {
        LogAspect logAspect = new LogAspect();
        return logAspect;
    }

}
