package com.projetointegrador.cemiteriovotorantim.domain.repository;

import com.projetointegrador.cemiteriovotorantim.domain.model.Finado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinadoRepository extends JpaRepository<Finado, Long> {

}
