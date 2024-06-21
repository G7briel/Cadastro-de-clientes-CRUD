package main.generics;

import java.util.HashMap;
import java.util.Map;

public class SingletonMap {

    private static SingletonMap singletonMap;

    /**
     * Simula o Banco de Dados
     */
    protected Map<Class, Map<?, ?>> map;

    private SingletonMap(){
        map = new HashMap<>();
    }

    /**
     * Garante o retorno de apenas uma instancia do objeto
     */
    public static SingletonMap getInstance() {
        if(singletonMap == null){
            singletonMap = new SingletonMap();
        }
        return singletonMap;
    }

    public Map<Class, Map<?, ?>> getMap(){
        return this.map;
    }


}
