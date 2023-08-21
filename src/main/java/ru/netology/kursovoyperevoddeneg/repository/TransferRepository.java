package ru.netology.kursovoyperevoddeneg.repository;

import ru.netology.kursovoyperevoddeneg.model.Card;
import ru.netology.kursovoyperevoddeneg.model.Operation;

import java.util.Map;

public interface TransferRepository {

    public Map<String, Card> getMapStorage();

    public Card getCard(String key);

    public void putCard(String cardNumber, Card card);

    public Operation getOperationFromId(String id);

    public void putOperationFromId(String id, Operation operation);

    public Map<String, Operation> getHistoryOfOperations();

    public void deleteOperationFromId(String id);

}