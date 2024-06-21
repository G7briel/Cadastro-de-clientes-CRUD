package main.services;

import main.generics.GenericService;
import main.generics.IGenericDAO;
import main.java.Cliente;

public class ClienteService extends GenericService<Cliente> implements IClienteService{

    public ClienteService(IGenericDAO<Cliente> iGenericDAO) {
        super(iGenericDAO);
    }


}
