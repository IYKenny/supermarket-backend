package emmy.ne.binarysupermarket.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import emmy.ne.binarysupermarket.dtos.PurchaseProductDTO;
import emmy.ne.binarysupermarket.models.ProductPurchased;

import java.util.List;

public interface IProductPurchasedService {

    List<ProductPurchased> byLoggedInCustomer();

    List<ProductPurchased> all();

    Page<ProductPurchased> allPaginated(Pageable pageable);


    ProductPurchased purchase(PurchaseProductDTO dto);
}
