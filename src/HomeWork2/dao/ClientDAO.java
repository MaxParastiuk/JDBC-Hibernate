package HomeWork2.dao;

import HomeWork2.entity.Client;

import java.util.List;

public interface ClientDAO {
    void add(Client client);

    List<Client> getAll();

    Client getById(int id);

    void updateClient(long id, String name, int age, String phone);

    void deleteClient(int id);

}
