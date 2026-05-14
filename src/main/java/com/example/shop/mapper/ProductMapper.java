package com.example.shop.mapper;
import com.example.shop.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("Select id,name,price,stock from product")
    List<Product> listProducts();
}
