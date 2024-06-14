package br.com.rpire.testes.generics;

import br.com.rpire.testes.Cliente;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

public abstract class GenericService <T extends Persistece,E extends Iservice> implements Igernericservice<E> {
    public abstract Class<T> geticlass();
    T dao;
    public GenericService(T dao){
        this.dao = dao;
    }

    @Override
    public boolean cadastrar(E cliente) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method cadastrar = geticlass().getMethod("cadastrar", Cliente.class);
        return (boolean )cadastrar.invoke(dao,cliente);

    }

    @Override
    public Cliente buscarCpf(Long cpf) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}
