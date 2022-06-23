package byronzhang.sample.hexagonalarchitecture.domain.service;

import byronzhang.sample.hexagonalarchitecture.application.ports.input.CreateProductUseCase;
import byronzhang.sample.hexagonalarchitecture.application.ports.input.GetProductUseCase;
import byronzhang.sample.hexagonalarchitecture.application.ports.output.ProductEventPublisher;
import byronzhang.sample.hexagonalarchitecture.application.ports.output.ProductOutputPort;
import byronzhang.sample.hexagonalarchitecture.domain.exception.ProductNotFound;
import byronzhang.sample.hexagonalarchitecture.domain.model.Product;
import byronzhang.sample.hexagonalarchitecture.domain.event.ProductCreatedEvent;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductService implements CreateProductUseCase, GetProductUseCase {

    private final ProductOutputPort productOutputPort;

    private final ProductEventPublisher productEventPublisher;

    @Override
    public Product createProduct(Product product) {
        product = productOutputPort.saveProduct(product);
        productEventPublisher.publishProductCreatedEvent(new ProductCreatedEvent(product.getId()));
        return product;
    }

    @Override
    public Product getProductById(Long id) {
        return productOutputPort.getProductById(id).orElseThrow(() -> new ProductNotFound("Product not found with id " + id));
    }

}
