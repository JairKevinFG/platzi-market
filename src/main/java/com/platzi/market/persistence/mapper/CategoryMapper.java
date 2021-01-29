package com.platzi.market.persistence.mapper;


import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    //vamos a convertir una categoria en Category
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category" ),
            @Mapping(source = "estado" , target = "active")
    })
    Category toCategory(Category categoria);

    @InheritInverseConfiguration
    @Mapping(target="productos", ignore = true)
    Categoria toCategoria(Category category);
}


