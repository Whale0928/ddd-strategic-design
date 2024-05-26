package kitchenpos.eatInOrder.infra;

import kitchenpos.eatInOrder.domain.OrderTable;
import kitchenpos.eatInOrder.domain.OrderTableRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderTableRepository extends JpaRepository<OrderTable, UUID>, OrderTableRepository {
}
