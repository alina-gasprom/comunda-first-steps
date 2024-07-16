package ru.alina.camundafirststeps.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.alina.camundafirststeps.service.UserService;
import ru.alina.camundafirststeps.web.client.AbsUserWebClient;

@Component
public class LoanDecisionClientUseCase implements JavaDelegate {
    private static final Logger log = LoggerFactory.getLogger(AbsUserWebClient.class);
    private final UserService userService;

    public LoanDecisionClientUseCase(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void execute(DelegateExecution delegateExecution) {
        log.debug("decision {}", "user can get a credit");
    }
}
