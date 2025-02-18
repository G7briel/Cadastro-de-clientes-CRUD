package test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.dao.IClienteDAO;
import main.exceptions.TipoChaveNaoEncontradaException;
import main.java.Cliente;
import test.mock.ClienteDaoMock;

public class ClienteDaoTest {

    private IClienteDAO clienteDao;
    private Cliente cliente;

    public ClienteDaoTest(){
        clienteDao = new ClienteDaoMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException{
        cliente = new Cliente();
        cliente.setCpf(12345678910L);
        cliente.setNome("Gabriel");
        cliente.setCidade("Guaratuba");
        cliente.setEstado("Paraná");
        cliente.setEnd("Rua");
        cliente.setNumero(999);
        cliente.setTel(47L);
        clienteDao.cadastrar(cliente);

    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultar = clienteDao.consultar(cliente.getCpf());

        Assert.assertNotNull(clienteConsultar);

    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException{
        Boolean retorno = clienteDao.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException{
        cliente.setNome("Gabriel Hartmann");
        clienteDao.alterar(cliente);
        Assert.assertEquals("Gabriel Hartmann", cliente.getNome());
    }

}
