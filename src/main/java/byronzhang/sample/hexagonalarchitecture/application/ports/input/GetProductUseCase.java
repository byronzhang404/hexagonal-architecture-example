package byronzhang.sample.hexagonalarchitecture.application.ports.input;

import byronzhang.sample.hexagonalarchitecture.domain.model.Product;

public interface GetProductUseCase {

    Product getProductById(Long id);

}
