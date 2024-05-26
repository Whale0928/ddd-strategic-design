package kitchenpos.eatInOrder.infra;

import kitchenpos.eatInOrder.domain.Order;
import kitchenpos.eatInOrder.domain.OrderTable;
import kitchenpos.eatInOrder.domain.constant.OrderStatus;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
    Order save(Order order);

    Optional<Order> findById(UUID id);

    List<Order> findAll();

    boolean existsByOrderTableAndStatusNot(OrderTable orderTable, OrderStatus status);
}
