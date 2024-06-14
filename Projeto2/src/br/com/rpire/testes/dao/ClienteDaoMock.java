package br.com.rpire.testes.dao;

import br.com.rpire.testes.Cliente;
import br.com.rpire.testes.generics.GenericDao;
import br.com.rpire.testes.generics.IclienteDao;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

public class ClienteDaoMock  implements IclienteDao<Cliente> {
    public ClienteDaoMock() throws InvocationTargetException, IllegalAccessException {
        super();
    }

    @Override
    public boolean cadastrar(Cliente cliente) throws InvocationTargetException, IllegalAccessException {
        return true;
    }

    @Override
    public Cliente buscarCpf(Long cpf) {
        Cliente c = new Cliente();
        return c;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        List<Cliente> list = List.of();
        return list;
    }
}
