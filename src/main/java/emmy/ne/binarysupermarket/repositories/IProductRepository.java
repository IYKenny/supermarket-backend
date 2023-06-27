package emmy.ne.binarysupermarket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import emmy.ne.binarysupermarket.models.Product;

public interface IProductRepository extends JpaRepository<Product,String> {
}
