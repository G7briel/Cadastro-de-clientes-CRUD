package main.dao;

import java.util.HashMap;
import java.util.Map;

import main.generics.GenericDAO;
import main.generics.SingletonMap;
import main.java.Cliente;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO{

    public <T> ClienteDAO(){
        super();
        Map<Long, T> mapaInterno = (Map<Long, T>) SingletonMap.getInstance().getMap().get(getTipoClasse());
        if (mapaInterno != null) {
            mapaInterno = new HashMap<>();
            SingletonMap.getInstance().getMap().put(getTipoClasse(), mapaInterno);

        }
    }

    @Override
    public Class<Cliente> getTipoClasse(){
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente cliente, Cliente entityCadastrado){
        entityCadastrado.setNome(cliente.getNome());
        entityCadastrado.setNumero(cliente.getNumero());
        entityCadastrado.setCidade(cliente.getCidade());
        entityCadastrado.setCpf(cliente.getCpf());
        entityCadastrado.setEnd(cliente.getEnd());
        entityCadastrado.setEstado(cliente.getEstado());
        entityCadastrado.setTel(cliente.getTel());
    }

}
