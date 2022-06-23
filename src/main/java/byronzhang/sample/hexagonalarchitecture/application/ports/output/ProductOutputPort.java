package byronzhang.sample.hexagonalarchitecture.application.ports.output;

import byronzhang.sample.hexagonalarchitecture.domain.model.Product;

import java.util.Optional;

public interface ProductOutputPort {

    Product saveProduct(Product product);

    Optional<Product> getProductById(Long id);

}
