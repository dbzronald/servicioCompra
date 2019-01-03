package com.web.compra.Repository;

import com.web.compra.Entity.Cliente;
import com.web.compra.Entity.Compra;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraPagRepository extends PagingAndSortingRepository<Compra, Integer> {

    Page<Compra> findAll(Pageable pageable);
    Page<Compra> findAllByCliente(Pageable pageable, Cliente cliente);
}