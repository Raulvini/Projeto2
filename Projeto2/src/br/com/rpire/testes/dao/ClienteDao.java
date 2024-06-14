package br.com.rpire.testes.dao;

import br.com.rpire.testes.Cliente;
import br.com.rpire.testes.generics.GenericDao;
import br.com.rpire.testes.generics.IclienteDao;
import br.com.rpire.testes.generics.Persistece;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ClienteDao extends GenericDao<Cliente> implements IclienteDao<Cliente>, Persistece {
    public ClienteDao() throws InvocationTargetException, IllegalAccessException {
       super();
    }

    @Override
    public Class<Cliente> getGenericClass() {
        return Cliente.class;
    }

    @Override
    public boolean cadastrar(Cliente cliente) throws InvocationTargetException, IllegalAccessException {
        return super.cadastrar(cliente);
    }

    @Override
    public Cliente buscarCpf(Long cpf) {
        return super.buscarCpf(cpf);
    }

    @Override
    public List<Cliente> buscarTodos() {
        return super.buscarTodos();
    }
}
