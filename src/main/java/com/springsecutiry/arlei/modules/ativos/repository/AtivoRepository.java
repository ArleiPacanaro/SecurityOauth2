package com.springsecutiry.arlei.modules.ativos.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecutiry.arlei.modules.ativos.entity.Ativo;

public interface AtivoRepository extends JpaRepository<Ativo, UUID> {
    List<Ativo> findAllByOrderByPlDesc();
}
