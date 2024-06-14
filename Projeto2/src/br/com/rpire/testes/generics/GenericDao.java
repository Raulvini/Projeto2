package br.com.rpire.testes.generics;

import br.com.rpire.testes.Id;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class GenericDao <T extends Iservice > implements IgenricDao<T>{
    public GenericDao() throws InvocationTargetException, IllegalAccessException {

        Method[] methods = getGenericClass().getMethods();

        for (Method id : methods){
            if(id.isAnnotationPresent(Id.class)){
                this.id = id;
            }
        }
        mapgenerico.put(getGenericClass(),mapinterno);

    }
    private Map<Class, Map<Long, T>> mapgenerico = new HashMap<>();
    private Map<Long,T> mapinterno = new HashMap<>();
    private Method id = null;



    public abstract Class<T> getGenericClass();
    @Override
    public boolean cadastrar(T cliente) throws InvocationTargetException, IllegalAccessException {
        mapinterno.put((Long) id.invoke(cliente), cliente);
        mapgenerico.put(getGenericClass(),mapinterno);
        return true;
    }
    @Override
    public T buscarCpf(Long cpf) {
        Map<Long,T> map =  mapgenerico.get(getGenericClass());
        if(map.containsKey(cpf)){
            return map.get(cpf);
        }

        return null;
    }
    @Override
    public List<T> buscarTodos() {
        Map<Long,T> map =  mapgenerico.get(getGenericClass());
        return map.values().stream().toList();

    }

}
