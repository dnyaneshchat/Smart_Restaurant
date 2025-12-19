package com.di.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.di.entity.MenuItem;
import com.di.service.MenuService;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    // Add menu item
    @PostMapping
    public MenuItem addMenuItem(@RequestBody MenuItem item) {
        return menuService.addMenuItem(item);
    }

    // Get all menu items
    @GetMapping
    public List<MenuItem> getAllMenuItems(){
    	System.out.println("hi");
        return menuService.getAllMenuItems();
    }
}
