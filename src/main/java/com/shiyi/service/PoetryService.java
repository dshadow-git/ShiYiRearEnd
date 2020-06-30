package com.shiyi.service;

import com.shiyi.dao.PoetryDao;

import java.util.List;

public interface PoetryService {

    public PoetryDao findByIdPoetry(String id);

    public List<PoetryDao> fingByNamePoetry(String name);

    public List<PoetryDao> findByLabelPoetry(String label);

    public List<PoetryDao> findByAuthorIdPoetry(String id);

    public List<PoetryDao> findByAuthorNamePoetry(String name);
}