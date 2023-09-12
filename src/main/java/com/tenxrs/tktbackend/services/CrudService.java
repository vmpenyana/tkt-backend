package com.tenxrs.tktbackend.services;

public interface CrudService<T, ID> {
    T save(T object);
    T findById(ID id);
    void delete(T object);
    void deleteById(ID id);
}
