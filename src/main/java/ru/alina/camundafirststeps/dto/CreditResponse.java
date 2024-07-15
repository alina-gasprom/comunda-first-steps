package ru.alina.camundafirststeps.dto;


public class CreditResponse {
    private final Boolean isApproved;

    public CreditResponse(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    public Boolean getApproved() {
        return isApproved;
    }

    @Override
    public String toString() {
        return "CreditResponse{" +
                "isApproved=" + isApproved +
                '}';
    }
}
