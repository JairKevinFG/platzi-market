package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

// recibe <la tabla , tipo de la clave primaria>
// crearemos un repositorio para acceder a nuestra entidad producto
//  que será el encargado de hacer nuestras consultas a la base de datos.
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
//heredaremos todos los metodos de crud repository









}
