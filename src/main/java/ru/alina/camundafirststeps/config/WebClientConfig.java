package ru.alina.camundafirststeps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

import java.time.Duration;

@Configuration
public class WebClientConfig {

    @Bean
    public RestClient restClient() {
        SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        clientHttpRequestFactory.setConnectTimeout(Duration.ofMillis(9000));
        clientHttpRequestFactory.setReadTimeout(Duration.ofMillis(9000));
        return RestClient.builder()
                .requestFactory(clientHttpRequestFactory)
                .build();
    }

}
