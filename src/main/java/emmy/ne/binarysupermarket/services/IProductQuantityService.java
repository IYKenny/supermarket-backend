package emmy.ne.binarysupermarket.services;

import emmy.ne.binarysupermarket.dtos.NewProductQuantityDTO;
import emmy.ne.binarysupermarket.models.ProductQuantity;

public interface IProductQuantityService {

    Integer byProduct(String productCode);

    ProductQuantity newQuantity(NewProductQuantityDTO dto);
}
