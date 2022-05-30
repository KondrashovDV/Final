package ru.skillfactory.final_app.service;

import ru.skillfactory.final_app.entity.Clients;

import java.util.List;

public interface ClientsService {
    Clients getByID(Long id);
    void save(Clients clients);
    List<Clients> getAll();
}
