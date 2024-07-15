package ru.alina.camundafirststeps.web.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import ru.alina.camundafirststeps.dto.CreditRequest;
import ru.alina.camundafirststeps.entity.UserEntity;
import ru.alina.camundafirststeps.web.client.properties.ABSProperties;

import java.net.URI;
import java.util.Objects;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class AbsUserWebClient {
    private static final Logger log = LoggerFactory.getLogger(AbsUserWebClient.class);
    private final RestClient restClient;
    private final ABSProperties absProperties;


    public AbsUserWebClient(RestClient restClient, ABSProperties absProperties) {
        this.restClient = restClient;
        this.absProperties = absProperties;
    }

    public boolean getUser(CreditRequest creditRequest) {
        URI uri = URI.create(absProperties.url() + "/users/is-client");

        return restClient.post().uri(uri).accept(APPLICATION_JSON).body(creditRequest).exchange((clientRequest, clientResponse) -> {
            if (clientResponse.getStatusCode() == HttpStatus.OK) {
                return Objects.requireNonNull(clientResponse.bodyTo(UserEntity.class)).isClient();
            } else {
                log.warn("unexpected error {}", clientResponse.getStatusCode());
                throw new RuntimeException();
            }
        });
    }
}
