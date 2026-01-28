package br.com.alexandrecamposcastro.controller;

import br.com.alexandrecamposcastro.model.Cliente;
import br.com.alexandrecamposcastro.service.ClienteService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

@Named
@RequestScoped
public class ClienteController {

    private Cliente cliente = new Cliente();
    private ClienteService service = new ClienteService();

    public void salvar() {
        try {
            service.cadastrar(cliente);
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Cliente cadastrado com sucesso."));
            cliente = new Cliente();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", e.getMessage()));
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}