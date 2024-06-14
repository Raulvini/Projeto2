package br.com.rpire.testes.service;

import br.com.rpire.testes.Cliente;
import br.com.rpire.testes.dao.ClienteDao;
import br.com.rpire.testes.generics.*;


public class ClienteService extends GenericService<ClienteDao,Cliente> implements IclienteService<Cliente>{

    private IclienteDao dao;

    public ClienteService(ClienteDao dao){
        super(dao);
    }

    @Override public Class<ClienteDao> geticlass() {
        return ClienteDao.class;
    }
}
