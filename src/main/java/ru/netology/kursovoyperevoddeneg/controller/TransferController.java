package ru.netology.kursovoyperevoddeneg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.netology.kursovoyperevoddeneg.exceptions.BadRequestExceptions;
import ru.netology.kursovoyperevoddeneg.model.CardTransfer;
import ru.netology.kursovoyperevoddeneg.model.Verification;

public interface TransferController {


    public ResponseEntity<String> transferMoneyCardToCard(@RequestBody @Validated CardTransfer cardTransfer) throws BadRequestExceptions;

    public ResponseEntity<String> confirmOperation(@RequestBody @Validated Verification verification) throws BadRequestExceptions;
}
