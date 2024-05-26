package kitchenpos.eatInOrder.infra;

import kitchenpos.eatInOrder.domain.Order;
import kitchenpos.eatInOrder.domain.OrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderRepository extends OrderRepository, JpaRepository<Order, UUID> {
}
