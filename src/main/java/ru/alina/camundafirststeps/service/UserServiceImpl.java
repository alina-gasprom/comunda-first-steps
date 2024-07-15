package ru.alina.camundafirststeps.service;

import org.springframework.stereotype.Service;
import ru.alina.camundafirststeps.dto.CreditRequest;
import ru.alina.camundafirststeps.web.client.AbsUserWebClient;

@Service
public class UserServiceImpl implements UserService{
    private final AbsUserWebClient absUserWebClient;

    public UserServiceImpl(AbsUserWebClient absUserWebClient) {
        this.absUserWebClient = absUserWebClient;
    }

    public boolean isUserExist(CreditRequest creditRequest) {
        return absUserWebClient.getUser(creditRequest);
    }
}
