package sda.springbasic.homeworkspring.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sda.springbasic.homeworkspring.model.Client;
import sda.springbasic.homeworkspring.service.ClientService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientController {
    private final ClientService service;

    @GetMapping("/allClients")
    private ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(service.getAllClients());
    }

    @PostMapping("/addClient")
    private ResponseEntity<List<Client>> addClient(@RequestBody @Valid Client client) {
        return ResponseEntity.ok(service.addClient(client));
    }

    @PatchMapping("/updateClient")
    private ResponseEntity<List<Client>> updateClient(@RequestBody @Valid Client client) {
        return ResponseEntity.ok(service.updateClient(client));
    }

    @DeleteMapping("/deleteClient")
    private ResponseEntity<List<Client>> deleteClient(Client client) {
        return ResponseEntity.ok(service.deleteClient(client));
    }

    @GetMapping("/client/{id}")
    private ResponseEntity<Client> getClientById(@PathVariable int id) {
        return ResponseEntity.ok(service.getClientById(id));
    }
}
