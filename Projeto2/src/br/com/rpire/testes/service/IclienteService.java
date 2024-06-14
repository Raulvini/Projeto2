package br.com.rpire.testes.service;

import br.com.rpire.testes.Cliente;
import br.com.rpire.testes.dao.ClienteDao;
import br.com.rpire.testes.generics.Igernericservice;
import br.com.rpire.testes.generics.Iservice;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

public interface IclienteService<T extends Iservice> extends Igernericservice<T> {

}
