package com.web.compra.Repository;

import com.web.compra.Entity.Cliente;
import com.web.compra.Entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer> {

    Compra findByCliente(Cliente cliente);

}