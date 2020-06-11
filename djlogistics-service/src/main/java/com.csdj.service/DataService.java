package com.csdj.service;

public interface DataService<T> {
    Integer add(T t);
    Integer del(T t);
}
