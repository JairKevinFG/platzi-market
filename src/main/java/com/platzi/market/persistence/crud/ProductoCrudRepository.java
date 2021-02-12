package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

// recibe <la tabla , tipo de la clave primaria>
// crearemos un repositorio para acceder a nuestra entidad producto
//  que será el encargado de hacer nuestras consultas a la base de datos.
//heredaremos todos los metodos de crud repository
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {

    //nativo :
  //  @Query(value="SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true )

    //con querymethods , lista de productos que pertenecen a una categoria , ordenados en orden alfabetico
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    //productos escasos  que esten activos
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);


}




