package test.mock;

import java.util.Collection;

import main.dao.IClienteDAO;
import main.exceptions.TipoChaveNaoEncontradaException;
import main.java.Cliente;

public class ClienteDaoMock implements IClienteDAO{

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {
        
    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
        
    }

    @Override
    public Cliente consultar(long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
        
    }


    

}
