package ru.alina.camundafirststeps.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import ru.alina.camundafirststeps.dto.CreditRequest;
import ru.alina.camundafirststeps.service.UserService;

@Component
public class LoanDecisionUseCase implements JavaDelegate {
    private final UserService userService;

    public LoanDecisionUseCase(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void execute(DelegateExecution delegateExecution) {
        boolean des = userService.isUserExist(new CreditRequest(1, 1L));
        delegateExecution.setVariable("isCreditApproved", des);
    }
}
