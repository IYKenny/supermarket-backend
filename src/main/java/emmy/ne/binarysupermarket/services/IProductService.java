package emmy.ne.binarysupermarket.services;

import emmy.ne.binarysupermarket.dtos.CreateOrUpdateProductDTO;
import emmy.ne.binarysupermarket.models.Product;

import java.util.List;

public interface IProductService {

    Product findByCode(String code);

    List<Product> all();

    Product register(CreateOrUpdateProductDTO dto);
}
