package main.generics;

import java.util.Collection;

import main.exceptions.TipoChaveNaoEncontradaException;
import main.java.Persistence;

public interface IGenericDAO <T extends Persistence>{

    /**
     * Método para cadastrar no banco(map)
     * @param entity a ser cadastrado
     * @return verdadeiro para cadastrado e falso para não cadsatrado
     */
    public  Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    /**
     * Método para excluit do banco(map)
     * @param valor Chave do objeto que será excluido
     */
    public void excluir(Long valor);

    /**
     * Método para alterar um registo no banco(map)
     * @param entity a ser atualizada
     */
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    /**
     * Método para consultar um registo no banco(map)
     * @param valor codigo do objeto
     * @return o objeto 
     */
    public T consultar(long valor);

    /**
     * Método que retorna todos os registros no banco de um determinado dado
     * @return Registros que foram encontrados
     */
    public Collection<T> buscarTodos();

}
