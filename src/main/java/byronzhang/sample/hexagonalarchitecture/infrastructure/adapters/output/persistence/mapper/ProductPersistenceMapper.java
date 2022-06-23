package byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.mapper;

import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity.ProductEntity;
import byronzhang.sample.hexagonalarchitecture.domain.model.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductPersistenceMapper {

    ProductEntity toProductEntity(Product product);

    Product toProduct(ProductEntity productEntity);

}
