package com.datajpa.repository;

import com.datajpa.domain.Spitter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpitterRepository extends JpaRepository<Spitter, Long> {

}
