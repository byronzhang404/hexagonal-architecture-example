package byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.mapper;

import byronzhang.sample.hexagonalarchitecture.domain.model.Product;
import byronzhang.sample.hexagonalarchitecture.domain.model.Product.ProductBuilder;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.request.ProductCreateRequest;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ProductCreateResponse;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ProductCreateResponse.ProductCreateResponseBuilder;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ProductQueryResponse;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ProductQueryResponse.ProductQueryResponseBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ProductRestMapperImpl implements ProductRestMapper {

    @Override
    public Product toProduct(ProductCreateRequest productCreateRequest) {
        if ( productCreateRequest == null ) {
            return null;
        }

        ProductBuilder product = Product.builder();

        product.name( productCreateRequest.getName() );
        product.description( productCreateRequest.getDescription() );

        return product.build();
    }

    @Override
    public ProductCreateResponse toProductCreateResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductCreateResponseBuilder productCreateResponse = ProductCreateResponse.builder();

        productCreateResponse.id( product.getId() );
        productCreateResponse.name( product.getName() );
        productCreateResponse.description( product.getDescription() );

        return productCreateResponse.build();
    }

    @Override
    public ProductQueryResponse toProductQueryResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductQueryResponseBuilder productQueryResponse = ProductQueryResponse.builder();

        productQueryResponse.id( product.getId() );
        productQueryResponse.name( product.getName() );
        productQueryResponse.description( product.getDescription() );

        return productQueryResponse.build();
    }
}
