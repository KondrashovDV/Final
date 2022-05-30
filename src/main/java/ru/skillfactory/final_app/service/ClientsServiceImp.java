package ru.skillfactory.final_app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.skillfactory.final_app.entity.Clients;
import ru.skillfactory.final_app.repository.ClientsRepository;

import java.util.List;
@Service
@Slf4j
public class ClientsServiceImp implements ClientsService{
    @Autowired
    ClientsRepository clientsRepository;

    @Override
    public Clients getByID(Long id) {
        return null;
    }

    @Override
    public void save(Clients clients) {

    }

    @Override
    public List<Clients> getAll() {
        return null;
    }
}
