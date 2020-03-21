package com.bolsadeideas.springboot.backend.apirest;

@FunctionalInterface
public interface BiFunctionI<T,R> {

    boolean validateTypeDocument(T t, R r);
}
