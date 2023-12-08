package com.bkaracan.card.service;

import com.bkaracan.card.dto.CardDto;

public interface CardService {

    void createCard(String mobileNumber);

    CardDto fetchCard(String mobileNumber);

    boolean updateCard(CardDto cardDto);

    boolean deleteCard(String mobileNumber);
}
