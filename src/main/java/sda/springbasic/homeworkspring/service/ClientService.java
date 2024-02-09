package sda.springbasic.homeworkspring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sda.springbasic.homeworkspring.model.Client;
import sda.springbasic.homeworkspring.repository.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository repo;

    public List<Client> getAllClients() {
        return repo.getAllClients();
    }
    public List<Client> addClient(Client client) {
        return repo.addClient(client);
    }
    public List<Client> updateClient(Client client) {
        return repo.updateClient(client);
    }
    public List<Client> deleteClient(Client client) {
        return repo.deleteClient(client);
    }
    public Client getClientById(int id) {
        return repo.getClientById(id);
    }
}
