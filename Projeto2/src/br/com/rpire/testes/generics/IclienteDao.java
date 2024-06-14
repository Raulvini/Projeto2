package br.com.rpire.testes.generics;

import br.com.rpire.testes.Cliente;


import java.util.List;

public interface IclienteDao<T extends Iservice> extends IgenricDao<T>{


}
