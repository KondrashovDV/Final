package ru.skillfactory.final_app.service;

import ru.skillfactory.final_app.entity.Balance;

import java.math.BigDecimal;
import java.util.Optional;

public interface BalanceService {
    Balance getBalance(Long id);
    Balance takeMoney(Long id, BigDecimal sum);
    Balance putMoney(Long id, BigDecimal sum);
}
