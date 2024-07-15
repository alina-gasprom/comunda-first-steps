package ru.alina.camundafirststeps.web.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.alina.camundafirststeps.dto.CreditRequest;
import ru.alina.camundafirststeps.dto.CreditResponse;
import ru.alina.camundafirststeps.service.UserService;

@RestController
public class MyRestController {
    private final UserService userService;

    public MyRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/credit")
    public ResponseEntity<?> askCredit(@RequestBody CreditRequest creditRequest) {
        boolean result = userService.isUserExist(creditRequest);
        return new ResponseEntity<>(new CreditResponse(result), HttpStatus.OK);
    }

}
