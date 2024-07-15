package ru.alina.camundafirststeps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.alina.camundafirststeps.web.client.properties.ABSProperties;

@SpringBootApplication
@EnableConfigurationProperties(ABSProperties.class)
public class CamundaFirstStepsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamundaFirstStepsApplication.class, args);
    }

}
