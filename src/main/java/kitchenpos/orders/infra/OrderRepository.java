package kitchenpos.orders.infra;

import kitchenpos.orders.domain.Order;
import kitchenpos.orders.domain.OrderTable;
import kitchenpos.orders.domain.constant.OrderStatus;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
    Order save(Order order);

    Optional<Order> findById(UUID id);

    List<Order> findAll();

    boolean existsByOrderTableAndStatusNot(OrderTable orderTable, OrderStatus status);
}
