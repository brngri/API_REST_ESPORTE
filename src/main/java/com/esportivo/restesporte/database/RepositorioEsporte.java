package com.esportivo.restesporte.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esportivo.restesporte.entidade.AtvEsporte;

public interface RepositorioEsporte extends JpaRepository<AtvEsporte,Long> {
    
}
