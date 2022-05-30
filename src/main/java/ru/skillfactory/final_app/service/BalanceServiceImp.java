package ru.skillfactory.final_app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.skillfactory.final_app.entity.Balance;
import ru.skillfactory.final_app.repository.BalanceRepository;

import java.math.BigDecimal;
import java.util.Optional;

@Service
@Slf4j

public class BalanceServiceImp implements BalanceService{
    @Autowired
    BalanceRepository balanceRepository;
    @Override
    public Balance getBalance(Long id) {
        return balanceRepository.getReferenceById(id);
    }

    @Override
    public Balance takeMoney(Long id, BigDecimal sum) {
        return null;
    }

    @Override
    public Balance putMoney(Long id, BigDecimal sum) {
        return null;
    }
}
