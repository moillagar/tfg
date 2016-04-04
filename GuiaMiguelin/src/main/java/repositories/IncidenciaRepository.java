package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Incidencia;


@Repository
public interface IncidenciaRepository extends JpaRepository<Incidencia,Integer>{

}
