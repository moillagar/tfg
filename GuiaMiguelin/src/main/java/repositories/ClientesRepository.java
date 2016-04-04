package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes,Integer>{

}
