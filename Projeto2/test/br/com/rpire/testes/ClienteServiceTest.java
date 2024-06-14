package br.com.rpire.testes;
import br.com.rpire.testes.dao.ClienteDao;
import br.com.rpire.testes.dao.ClienteDaoMock;
import br.com.rpire.testes.generics.IclienteDao;
import br.com.rpire.testes.generics.Iservice;
import br.com.rpire.testes.generics.Persistece;
import br.com.rpire.testes.service.ClienteService;
import br.com.rpire.testes.service.IclienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class ClienteServiceTest {
    private IclienteService service;
    private Cliente cliente;
    public ClienteServiceTest() throws InvocationTargetException, IllegalAccessException {
        ClienteDao dao= new ClienteDao();
        this.service = new ClienteService(dao);
    }
    @Before
    public void init() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        cliente = new Cliente();
        cliente.setCpf(61120523305L);
        cliente.setEnd("end");
        cliente.setCidade("ocara");
        cliente.setNome("rraul");
        cliente.setEstado("Ceara");
        cliente.setTel(92630528);
        boolean teste = service.cadastrar(cliente);
    }

    @Test
    public void cadastrarCliente() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        boolean teste = service.cadastrar(cliente);
        Assert.assertEquals(true,teste);
    }
}
