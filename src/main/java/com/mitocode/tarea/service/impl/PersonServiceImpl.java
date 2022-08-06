package com.mitocode.tarea.service.impl;

import com.mitocode.tarea.model.Person;
import com.mitocode.tarea.repo.IGenericRepo;
import com.mitocode.tarea.repo.IPersonRepo;
import com.mitocode.tarea.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends CRUDImpl<Person, Integer> implements IPersonService {

    @Autowired
    private IPersonRepo repo;

    @Override
    protected IGenericRepo<Person, Integer> getRepo() {
        return repo;
    }


}
