package br.com.rpire.testes;

import br.com.rpire.testes.dao.ClienteDao;

import br.com.rpire.testes.generics.IclienteDao;
import br.com.rpire.testes.generics.Iservice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class ClienteDaoTest {
    private IclienteDao dao;
    private Cliente cliente;
    public ClienteDaoTest() throws InvocationTargetException, IllegalAccessException {
         this.dao = new ClienteDao();
    }
    @Before
    public void init() throws InvocationTargetException, IllegalAccessException {
        cliente = new Cliente();
        cliente.setCpf(61120523305L);
        cliente.setEnd("end");
        cliente.setCidade("ocara");
        cliente.setNome("rraul");
        cliente.setEstado("Ceara");
        cliente.setTel(92630528);
        boolean teste = dao.cadastrar(cliente);
    }
    @Test
    public void buscarCliente(){
        Cliente teste = (Cliente) dao.buscarCpf(61120523305L);
        Assert.assertEquals(teste,cliente);
    }
    @Test
    public void cadastrarCliente() throws InvocationTargetException, IllegalAccessException {
        boolean teste = dao.cadastrar(cliente);
        Assert.assertEquals(true,teste);
    }
}
