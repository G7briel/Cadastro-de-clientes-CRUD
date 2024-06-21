package main.generics;

import java.util.Collection;

import main.exceptions.TipoChaveNaoEncontradaException;
import main.java.Persistence;

public class GenericService <T extends Persistence> implements IGenericService<T>{

    private IGenericDAO<T> iGenericDAO;

    public GenericService(IGenericDAO<T> iGenericDAO){
        this.iGenericDAO = iGenericDAO;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
        return iGenericDAO.cadastrar(entity);
    }

    @Override
    public void excluir(Long valor) {
        iGenericDAO.excluir(valor);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException {
        iGenericDAO.alterar(entity);
    }

    @Override
    public T consultar(long valor) {
        return iGenericDAO.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        return iGenericDAO.buscarTodos();
    }

}
