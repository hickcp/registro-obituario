package com.projetointegrador.cemiteriovotorantim.domain.repository;

import com.projetointegrador.cemiteriovotorantim.domain.model.Concessionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConcessionarioRepository extends JpaRepository<Concessionario, Long> {
    List<Concessionario> findByNomeIgnoreCase(String nome);

    @Query("FROM Concessionario c WHERE c.nome LIKE %?1%")
    List<Concessionario> findByNomeStartsWithIgnoreCase(String nome);
}
