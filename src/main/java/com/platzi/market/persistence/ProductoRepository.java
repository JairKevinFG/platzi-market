package com.platzi.market.persistence;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


// le indicamos a spring que esta clase se encarga de interactuar con la base de datos
// tambien podriamos usar @component , pero es muy general. mejor es :
@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    //todos los productos de nuestra base de datos
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAAndEstado(cantidad,true);
    }

    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }
    // guardar un producto
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }
    //eliminar un producto
    public void delete (int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }

}
