package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.*;

@Repository
public interface CalificacionOfertaRepository extends JpaRepository<CalificacionOferta,Integer>{

}
