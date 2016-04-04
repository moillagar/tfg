package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Proveedor;


@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor,Integer>{

}
