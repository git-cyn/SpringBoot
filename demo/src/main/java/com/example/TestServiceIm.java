package com.example;

import ddd.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2018/4/10.
 */

@Service
public class TestServiceIm implements TestService {
    @Override
    public int get() {
        return 0;
    }
}
