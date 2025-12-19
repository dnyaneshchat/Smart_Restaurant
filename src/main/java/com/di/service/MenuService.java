package com.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.entity.MenuItem;
import com.di.repository.MenuRepository;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public MenuItem addMenuItem(MenuItem item) {
        return menuRepository.save(item);
    }

    public List<MenuItem> getAllMenuItems() {
        return menuRepository.findAll();
    }
}
