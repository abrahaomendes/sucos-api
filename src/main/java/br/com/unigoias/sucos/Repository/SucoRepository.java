package br.com.unigoias.sucos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unigoias.sucos.model.Suco;

@Repository
public interface SucoRepository extends JpaRepository<Suco, Long>{ 
}
