package com.jk.service.impl;

import com.jk.dao.RenMapper;
import com.jk.model.Ren;
import com.jk.service.RenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by new鹏 on 2018/5/4.
 */
@Service("renService")
public class RenServiceImpl implements RenService {

    @Autowired
    private RenMapper renMapper;

    @Override
    public List<Ren> querylist() {
        return renMapper.querylist();
    }
}
