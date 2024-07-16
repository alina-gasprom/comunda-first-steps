package ru.alina.camundafirststeps.camunda;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.alina.camundafirststeps.dto.CreditRequest;
import ru.alina.camundafirststeps.service.UserService;


@Component
public class IsClientUseCase implements JavaDelegate {
    private static final Logger log = LoggerFactory.getLogger(IsClientUseCase.class);
    private final UserService userService;
    private final RuntimeService runtimeService;

    public IsClientUseCase(UserService userService, RuntimeService runtimeService) {
        this.userService = userService;
        this.runtimeService = runtimeService;
    }

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        boolean des = userService.isUserExist(new CreditRequest(1, 1L));
        log.debug("decision {}", des);
        delegateExecution.setVariable("des", des);
    }
}
