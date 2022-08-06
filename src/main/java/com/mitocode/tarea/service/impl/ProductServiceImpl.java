package com.mitocode.tarea.service.impl;

import com.mitocode.tarea.model.Product;
import com.mitocode.tarea.repo.IGenericRepo;
import com.mitocode.tarea.repo.IProductRepo;
import com.mitocode.tarea.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends CRUDImpl<Product, Integer> implements IProductService {

    @Autowired
    private IProductRepo repo;

    @Override
    protected IGenericRepo<Product, Integer> getRepo() {
        return repo;
    }


}
