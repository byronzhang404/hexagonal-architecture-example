package byronzhang.sample.hexagonalarchitecture.application.ports.output;

import byronzhang.sample.hexagonalarchitecture.domain.event.ProductCreatedEvent;

public interface ProductEventPublisher {

    void publishProductCreatedEvent(ProductCreatedEvent event);

}
