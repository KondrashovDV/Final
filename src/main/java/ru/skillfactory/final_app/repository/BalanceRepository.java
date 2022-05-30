package ru.skillfactory.final_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skillfactory.final_app.entity.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Long> {

}
