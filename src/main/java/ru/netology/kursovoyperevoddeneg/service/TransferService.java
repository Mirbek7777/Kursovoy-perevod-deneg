package ru.netology.kursovoyperevoddeneg.service;

import ru.netology.kursovoyperevoddeneg.exceptions.BadRequestExceptions;
import ru.netology.kursovoyperevoddeneg.model.CardTransfer;
import ru.netology.kursovoyperevoddeneg.model.Verification;

public interface TransferService {

    public String transferMoneyCardToCard(CardTransfer cardTransfer) throws BadRequestExceptions;

    public String confirmOperation(Verification verification) throws BadRequestExceptions;
}
