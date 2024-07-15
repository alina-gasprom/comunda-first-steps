package ru.alina.camundafirststeps.service;

import ru.alina.camundafirststeps.dto.CreditRequest;

public interface UserService {

    boolean isUserExist(CreditRequest creditRequest);
}
