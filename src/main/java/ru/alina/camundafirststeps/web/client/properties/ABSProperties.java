package ru.alina.camundafirststeps.web.client.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "abs")
public record ABSProperties(String url, String register, String account) {
}
