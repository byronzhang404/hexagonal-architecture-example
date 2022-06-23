package byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.repository;

import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
