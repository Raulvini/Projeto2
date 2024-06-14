package br.com.rpire.testes.generics;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

public interface IgenricDao<T extends Iservice>{
    boolean cadastrar(T cliente) throws InvocationTargetException, IllegalAccessException;

    T buscarCpf(Long cpf);

    Collection<T> buscarTodos();





}
