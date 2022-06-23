package byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.mapper;

import byronzhang.sample.hexagonalarchitecture.domain.model.Product;
import byronzhang.sample.hexagonalarchitecture.domain.model.Product.ProductBuilder;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity.ProductEntity;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity.ProductEntity.ProductEntityBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ProductPersistenceMapperImpl implements ProductPersistenceMapper {

    @Override
    public ProductEntity toProductEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductEntityBuilder productEntity = ProductEntity.builder();

        productEntity.id( product.getId() );
        productEntity.name( product.getName() );
        productEntity.description( product.getDescription() );

        return productEntity.build();
    }

    @Override
    public Product toProduct(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        ProductBuilder product = Product.builder();

        product.id( productEntity.getId() );
        product.name( productEntity.getName() );
        product.description( productEntity.getDescription() );

        return product.build();
    }
}
