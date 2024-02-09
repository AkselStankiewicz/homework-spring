package sda.springbasic.homeworkspring.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import sda.springbasic.homeworkspring.exceptions.ClientAlreadyExistsException;
import sda.springbasic.homeworkspring.exceptions.NoSuchClientInDatabase;
import sda.springbasic.homeworkspring.model.Client;

import java.util.ArrayList;
import java.util.List;
@Repository
@RequiredArgsConstructor
@Slf4j
public class InMemoryClientRepository implements ClientRepository{
    private static final List<Client> clients;

    static {
        clients = new ArrayList<>();

        clients.add(Client.builder()
                .id(1)
                .name("Andrzej")
                .surname("Polak")
                .phoneNumber("421421341")
                .build());
        clients.add(Client.builder()
                .id(2)
                .name("Bogdan")
                .surname("Senior")
                .phoneNumber("852742874")
                .build());
        clients.add(Client.builder()
                .id(3)
                .name("Sabina")
                .surname("Wolska")
                .phoneNumber("558876215")
                .build());
    }
    @Override
    public List<Client> addClient(Client client) {
        if (clients.stream().anyMatch(c -> c.getId() == client.getId())) {
            throw new ClientAlreadyExistsException();
        }
        clients.add(client);
        return clients;
    }

    @Override
    public List<Client> getAllClients() {
        return clients;
    }

    @Override
    public List<Client> updateClient(Client client) {

        Client clientToUpdate = clients.stream()
                .filter(c -> c.getId() == client.getId())
                .findFirst().orElseThrow(NoSuchClientInDatabase::new);
        clients.remove(clientToUpdate);
        clients.add(client);
        return clients;
    }

    @Override
    public List<Client> deleteClient(Client client) {
        if(!clients.remove(client)) {
            throw new NoSuchClientInDatabase();
        }
        return clients;
    }

    @Override
    public Client getClientById(int id) {
        return clients.stream()
                .filter(client -> client.getId() == id)
                .findFirst().orElseThrow(NoSuchClientInDatabase::new);
    }
}
