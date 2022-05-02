package com.telefones.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telefones.domain.model.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}
