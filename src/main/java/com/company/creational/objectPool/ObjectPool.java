package com.company.creational.objectPool;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    // Se pueden usar diferentes tipos de estructuras de datos
    // Investigar BlockingQueue
    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingDeque<>();
        for(int i=0; i < count; i++){
            availablePool.offer(creator.get());
        }
    }

    // Método get debe decidir que hacer en caso de que el pool esta vacío,
    // Puede crear un nuevo objeto y devolverlo, o esperar hasta que uno este disponible
    public T get() {
        try{
            // Esperar si ninguno esta libre, pero eso puede tener un impacto severo
            return availablePool.take();
        }catch (InterruptedException ex){
            System.err.println("take() fue interrumpido");
        }

        return null;
    }

    public void release(T obj) {
        obj.reset();

        try{
            availablePool.put(obj);
        }catch (InterruptedException ex){
            System.err.println("put() fue interrumpido");
        }
    }
}
