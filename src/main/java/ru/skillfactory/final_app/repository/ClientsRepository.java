package ru.skillfactory.final_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skillfactory.final_app.entity.Clients;

public interface ClientsRepository extends JpaRepository<Clients, Long> {
}
