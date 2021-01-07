package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

// recibe <la tabla , tipo de la clave primaria>
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {


}
