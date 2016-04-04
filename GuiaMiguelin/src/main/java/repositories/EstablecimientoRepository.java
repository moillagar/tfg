package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Establecimiento;

@Repository
public interface EstablecimientoRepository extends JpaRepository<Establecimiento,Integer>{

}
