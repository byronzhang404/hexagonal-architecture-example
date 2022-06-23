package byronzhang.sample.hexagonalarchitecture.infrastructure.adapters.input.eventlistener;

import byronzhang.sample.hexagonalarchitecture.domain.event.ProductCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductEventListenerAdapter {

    @EventListener
    public void handle(ProductCreatedEvent event){
        log.info("Product created with id " + event.getId() + " at " + event.getDate());
    }

}
