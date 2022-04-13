package com.projetointegrador.cemiteriovotorantim.domain.repository;

import com.projetointegrador.cemiteriovotorantim.domain.model.Concessionario;
import com.projetointegrador.cemiteriovotorantim.domain.model.Finado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinadoRepository extends JpaRepository<Finado, Long> {
    List<Finado> findAllByConcessionario (Concessionario concessionario);
    @Query("FROM Finado f WHERE f.nome LIKE %?1%")
    List<Finado> findByNomeStartsWithIgnoreCase(String nome);
}
