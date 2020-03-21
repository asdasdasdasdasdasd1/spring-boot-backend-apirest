package com.bolsadeideas.springboot.backend.apirest;

@FunctionalInterface
public interface PredicateI<T, R> {

    boolean validate(String t);
}
