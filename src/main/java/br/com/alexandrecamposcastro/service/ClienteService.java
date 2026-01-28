package br.com.alexandrecamposcastro.service;

import br.com.alexandrecamposcastro.model.Cliente;
import br.com.alexandrecamposcastro.repository.ClienteRepository;

public class ClienteService {

    private ClienteRepository repository;

    public ClienteService() {
        this.repository = new ClienteRepository();
    }

    public void cadastrar(Cliente cliente) throws Exception {
        if (cliente.getNome() == null || cliente.getNome().trim().isEmpty()) {
            throw new Exception("O nome é obrigatorio.");
        }
        if (cliente.getEmail() == null || !cliente.getEmail().contains("@")) {
            throw new Exception("Email invalido.");
        }

        repository.salvar(cliente);
    }
}