package test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.dao.IClienteDAO;
import main.exceptions.TipoChaveNaoEncontradaException;
import main.java.Cliente;
import main.services.ClienteService;
import main.services.IClienteService;
import test.mock.ClienteDaoMock;

public class ClienteServiceTest {  

    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);

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

    }

    @Test
    public void pesquisarCliente(){

        Cliente clienteConsultar = clienteService.consultar(cliente.getCpf());

        Assert.assertNotNull(clienteConsultar);

    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException{
        Boolean retorno = clienteService.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException{
        cliente.setNome("Gabriel Hartmann");
        clienteService.alterar(cliente);
        Assert.assertEquals("Gabriel Hartmann", cliente.getNome());
    }
}
