package ru.alina.camundafirststeps.entity;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UserEntity {
    private boolean isClient;


    private UserEntity() {
    }

    @JsonCreator
    public UserEntity(boolean isClient) {
        this.isClient = isClient;
    }

    public boolean isClient() {
        return isClient;
    }


    @Override
    public String toString() {
        return "CreditResponse{" +
                "isApproved=" + isClient +
                '}';
    }
}
