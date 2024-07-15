package ru.alina.camundafirststeps.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

public class CreditRequest {
    private final Integer passportSeries;
    private final Long passportNumber;

    @JsonCreator
    public CreditRequest(Integer passportSeries, Long passportNumber) {
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    public Integer getPassportSeries() {
        return passportSeries;
    }

    public Long getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String toString() {
        return "CreditRequest{" +
                "passportSeries=" + passportSeries +
                ", passportNumber=" + passportNumber +
                '}';
    }
}
