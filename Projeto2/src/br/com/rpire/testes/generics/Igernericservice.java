package br.com.rpire.testes.generics;

import br.com.rpire.testes.Cliente;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

public interface Igernericservice <T extends Iservice>{
    public boolean cadastrar(T cliente) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;


    public Cliente buscarCpf(Long cpf);


    public Collection<Cliente> buscarTodos();
}