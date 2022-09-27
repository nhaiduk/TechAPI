package br.com.fiap.abctechapi.repository;

import br.com.fiap.abctechapi.model.Assistance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssistanceRepository extends JpaRepository<Assistance,Long> {
}
