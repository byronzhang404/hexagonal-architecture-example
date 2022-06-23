package byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.mapper;

import byronzhang.sample.hexagonalarchitecture.domain.model.Product;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ProductQueryResponse;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.request.ProductCreateRequest;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ProductCreateResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ProductRestMapper {

    Product toProduct(ProductCreateRequest productCreateRequest);

    ProductCreateResponse toProductCreateResponse(Product product);

    ProductQueryResponse toProductQueryResponse(Product product);

}
