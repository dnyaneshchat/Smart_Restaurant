package com.di.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.di.entity.MenuItem;

public interface MenuRepository extends JpaRepository<MenuItem, Long> {

}
