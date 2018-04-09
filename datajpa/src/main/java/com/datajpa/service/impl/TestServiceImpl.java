package com.datajpa.service.impl;

import com.datajpa.domain.Spitter;
import com.datajpa.repository.SpitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.datajpa.service.TestService;

import java.util.List;

/**
 * Created by admin on 2018/4/9.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    SpitterRepository spitterRepository;
    @Override
    public int findALL() {
        List<Spitter> list = spitterRepository.findAll();
        return  spitterRepository.findAll().size();
    }
}
