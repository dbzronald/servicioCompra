package com.web.compra.Repository;

import com.web.compra.Entity.ArtCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtCompraRepository extends JpaRepository<ArtCompra, Integer> {
}