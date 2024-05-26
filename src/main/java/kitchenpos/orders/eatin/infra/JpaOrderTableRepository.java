package kitchenpos.orders.eatin.infra;

import kitchenpos.orders.eatin.domain.OrderTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderTableRepository extends JpaRepository<OrderTable, UUID>, OrderTableRepository {
}
