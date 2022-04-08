package com.projetointegrador.cemiteriovotorantim.domain.repository;

import com.projetointegrador.cemiteriovotorantim.domain.model.Concessionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcessionarioRepository extends JpaRepository<Concessionario, Long> {
}
