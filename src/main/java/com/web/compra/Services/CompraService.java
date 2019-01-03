package com.web.compra.Services;

import com.web.compra.Entity.ArtCompra;
import com.web.compra.Entity.Articulo;
import com.web.compra.Entity.Cliente;
import com.web.compra.Entity.Compra;
import com.web.compra.Repository.ArtCompraRepository;
import com.web.compra.Repository.CompraPagRepository;
import com.web.compra.Repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private ArtCompraRepository artCompraRepository;

    @Autowired
    private CompraPagRepository compraPagRepository;

    public void crearCompra(Compra compra) {
        compraRepository.save(compra);
    }

    public List<Compra> compraList() {
        return compraRepository.findAll();
    }

    public Compra buscarPorCliente(Cliente cliente) {
        return compraRepository.findByCliente(cliente);
    }

    public List<Compra> comprasPorPaginacion(Pageable pageable) {
        return compraPagRepository.findAll(pageable).getContent();
    }

    public List<Compra> comprasPorPagCliente(Pageable pageable, Cliente cliente) {
        return compraPagRepository.findAllByCliente(pageable, cliente).getContent();
    }

    public Compra compraPorId(int id){
        return compraRepository.findById(id).orElse(null);
    }

    public List<Articulo> articulosPorCompra(int compraId) {

        Compra compra = compraRepository.findById(compraId).orElse(null);
        List<Articulo> articuloList;

        articuloList = new ArrayList<>();
        if (compra != null) {

            for (ArtCompra articuloCompra : compra.getArticuloCompra()) {
                articuloList.add(articuloCompra.getArticulo());
            }
        }
        return articuloList;
    }
}