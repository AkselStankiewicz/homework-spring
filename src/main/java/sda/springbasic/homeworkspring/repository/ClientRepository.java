package sda.springbasic.homeworkspring.repository;

import sda.springbasic.homeworkspring.model.Client;

import java.util.List;

public interface ClientRepository {
    public List<Client> addClient(Client client);
    public List<Client> getAllClients();
    public List<Client> updateClient(Client client);
    public List<Client> deleteClient(Client client);
    public Client getClientById(int id);
}
