package byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.config;

import byronzhang.sample.hexagonalarchitecture.domain.service.ProductService;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.output.eventpublisher.ProductEventPublisherAdapter;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.ProductPersistenceAdapter;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.mapper.ProductPersistenceMapper;
import byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.repository.ProductRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ProductPersistenceAdapter productPersistenceAdapter(ProductRepository productRepository, ProductPersistenceMapper productPersistenceMapper) {
        return new ProductPersistenceAdapter(productRepository, productPersistenceMapper);
    }

    @Bean
    public ProductEventPublisherAdapter productEventPublisherAdapter(ApplicationEventPublisher applicationEventPublisher) {
        return new ProductEventPublisherAdapter(applicationEventPublisher);
    }

    @Bean
    public ProductService productService(ProductPersistenceAdapter productPersistenceAdapter, ProductEventPublisherAdapter productEventPublisherAdapter) {
        return new ProductService(productPersistenceAdapter, productEventPublisherAdapter);
    }

}
