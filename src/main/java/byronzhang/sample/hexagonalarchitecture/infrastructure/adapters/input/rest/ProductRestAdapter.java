package byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest;

import byronzhang.sample.hexagonalarchitecture.application.ports.input.GetProductUseCase;
import byronzhang.sample.hexagonalarchitecture.domain.model.Product;
import byronzhang.sample.hexagonalarchitecture.application.ports.input.CreateProductUseCase;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.request.ProductCreateRequest;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ProductCreateResponse;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ProductQueryResponse;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.mapper.ProductRestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class ProductRestAdapter {

    private final CreateProductUseCase createProductUseCase;

    private final GetProductUseCase getProductUseCase;

    private final ProductRestMapper productRestMapper;

    @PostMapping(value = "/products")
    public ResponseEntity<ProductCreateResponse> createProduct(@RequestBody @Valid ProductCreateRequest productCreateRequest){
        // Request to domain
        Product product = productRestMapper.toProduct(productCreateRequest);

        product = createProductUseCase.createProduct(product);

        // Domain to response
        return new ResponseEntity<>(productRestMapper.toProductCreateResponse(product), HttpStatus.CREATED);
    }

    @GetMapping(value = "/products/{id}")
    public ResponseEntity<ProductQueryResponse> getProduct(@PathVariable Long id){
        Product product = getProductUseCase.getProductById(id);
        return new ResponseEntity<>(productRestMapper.toProductQueryResponse(product), HttpStatus.OK);
    }

}
