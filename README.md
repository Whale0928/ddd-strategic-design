# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항

### 상품

- 상품을 등록할 수 있다.`
- 상품의 가격이 올바르지 않으면 등록할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 이름이 올바르지 않으면 등록할 수 없다.
    - 상품의 이름에는 비속어가 포함될 수 없다.
- 상품의 가격을 변경할 수 있다.
- 상품의 가격이 올바르지 않으면 변경할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 가격이 변경될 때 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 크면 메뉴가 숨겨진다.
- 상품의 목록을 조회할 수 있다.

### 메뉴 그룹

- 메뉴 그룹을 등록할 수 있다.
- 메뉴 그룹의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴 그룹의 이름은 비워 둘 수 없다.
- 메뉴 그룹의 목록을 조회할 수 있다.

### 메뉴

- 1 개 이상의 등록된 상품으로 메뉴를 등록할 수 있다.
- 상품이 없으면 등록할 수 없다.
- 메뉴에 속한 상품의 수량은 0 이상이어야 한다.
- 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴는 특정 메뉴 그룹에 속해야 한다.
- 메뉴의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 이름에는 비속어가 포함될 수 없다.
- 메뉴의 가격을 변경할 수 있다.
- 메뉴의 가격이 올바르지 않으면 변경할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴를 노출할 수 있다.
- 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 높을 경우 메뉴를 노출할 수 없다.
- 메뉴를 숨길 수 있다.
- 메뉴의 목록을 조회할 수 있다.

### 주문 테이블

- 주문 테이블을 등록할 수 있다.
- 주문 테이블의 이름이 올바르지 않으면 등록할 수 없다.
    - 주문 테이블의 이름은 비워 둘 수 없다.
- 빈 테이블을 해지할 수 있다.
- 빈 테이블로 설정할 수 있다.
- 완료되지 않은 주문이 있는 주문 테이블은 빈 테이블로 설정할 수 없다.
- 방문한 손님 수를 변경할 수 있다.
- 방문한 손님 수가 올바르지 않으면 변경할 수 없다.
    - 방문한 손님 수는 0 이상이어야 한다.
- 빈 테이블은 방문한 손님 수를 변경할 수 없다.
- 주문 테이블의 목록을 조회할 수 있다.

### 주문

- 1개 이상의 등록된 메뉴로 배달 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 포장 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 매장 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 매장 주문은 주문 항목의 수량이 0 미만일 수 있다.
- 매장 주문을 제외한 주문의 경우 주문 항목의 수량은 0 이상이어야 한다.
- 배달 주소가 올바르지 않으면 배달 주문을 등록할 수 없다.
    - 배달 주소는 비워 둘 수 없다.
- 빈 테이블에는 매장 주문을 등록할 수 없다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 배달 주문을 접수되면 배달 대행사를 호출한다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 배달한다.
- 배달 주문만 배달할 수 있다.
- 서빙된 주문만 배달할 수 있다.
- 주문을 배달 완료한다.
- 배달 중인 주문만 배달 완료할 수 있다.
- 주문을 완료한다.
- 배달 주문의 경우 배달 완료된 주문만 완료할 수 있다.
- 포장 및 매장 주문의 경우 서빙된 주문만 완료할 수 있다.
- 주문 테이블의 모든 매장 주문이 완료되면 빈 테이블로 설정한다.
- 완료되지 않은 매장 주문이 있는 주문 테이블은 빈 테이블로 설정하지 않는다.
- 주문 목록을 조회할 수 있다.

## 용어사전

### 공통

| 한글명 | 영문명      | 설명                    |
|-----|----------|-----------------------|
| 매장  | shop     | POS를 조작하고 치킨을 판매하는 가게 |
| 고객  | customer | 치킨을 구매하는 고객.          |
| 배달원 | rider    | 고객에게 치킨을 배달하는 사람.     |

### 상품

| 한글명 | 영문명     | 설명                  |
|-----|---------|---------------------|
| 상품  | product | 메뉴를 구성할 수 있는 최소 단위. |
| 가격  | price   | 0원 이상의 상품의 가격.      |
| 이름  | name    | 상품의 이름.             |

### 메뉴 그룹

| 한글명   | 영문명        | 설명                                         |
|-------|------------|--------------------------------------------|
| 메뉴 그룹 | menu group | 메뉴의 개념을  그룹화 한다.                           |
| 이름    | name       | 메뉴그룹의 개성을 나타내는 그룹의 이름.     ex.매운치킨들, 두마리메뉴 |

### 메뉴

| 한글명    | 영문명     | 설명                                     |
|--------|---------|----------------------------------------|
| 메뉴     | menu    | 고객에게 판매되는 단위.  하나 이상의 상품으로 구성된다.       |
| 이름     | name    | 메뉴의 이름                                 | 
| 가격     | price   | 0원 이상의 상품의 가격. 구성된 상품의 가격보다 크거나 같아야한다. |
| 공개 메뉴  | display | 고객이 주문가능한 공개된 메뉴                       |
| 비공개 메뉴 | hide    | 고객이 주문 불가능한 비공개된 메뉴                    |

------

### 주문 테이블

| 한글명     | 영문명              | 설명                      |
|---------|------------------|-------------------------|
| 주문 테이블  | order table      | 고객이 매장 주문을 할 수 있는 테이블.  |
| 이름      | name             | 주문 테이블의 이름.             |
| 방문 손님 수 | number of guests | 주문 테이블에 앉아있는 고객 수.      |
| 빈 테이블   | empty table      | 새로운 주문을 받을 수 있는 상태의 테이블 |

### 주문

| 한글명   | 영문명             | 설명                      |
|-------|-----------------|-------------------------|
| 주문    | order           | 고객이 주문한 메뉴와 수량.         |
| 주문 상품 | order line item | 주문한 메뉴들의 수량.            |
| 주문 방식 | order type      | 고객이 주문한 방식. 배달, 포장, 매장. |
| 주문 상태 | order status    | 주문의 진행 상태.              |

### 배달 주문

| 한글명         | 영문명              | 설명                  |
|-------------|------------------|---------------------|
| 배달 주문       | delivery order   | 고객이 요청한 배달 주문       |
| 배달 주소       | delivery address | 고객이 배달 받을 주소.       | 
| 배달 대행사      | delivery agency  | 배달 주문을 처리하는 대행사.    |
| 배달 주문 접수 대기 | waiting          | 매장이 주문을 접수하기 전 상태   | 
| 배달 주문 접수    | accepted         | 배달 주문을 접수한 상태.      |
| 배달 음식 전달    | served           | 배달 주문을 배달원에게 전달한 상태 | 
| 배달 진행 중     | delivering       | 배달이 시작한 상태          | 
| 배달 완료       | delivered        | 배달이 완료된 상태          | 
| 주문 완료       | completed        | 모든 주문이 완료된 상태       | 

### 포장 주문

| 한글명         | 영문명           | 설명                     |
|-------------|---------------|------------------------|
| 포장 주문       | takeout order | 고객이 포장 주문한 주문.         |
| 포장 주문 접수 대기 | waiting       | 매장이 주문을 접수하기 전 상태      |      
| 포장 주문 접수    | accepted      | 포장 주문을 접수한 상태.         |         
| 제공(서빙) 완료   | served        | 접수된 주문을 고객에게 제공한 상태    |    
| 주문 완료       | completed     | 메뉴를 전달받고 모든 주문이 종료된 상태 | 

### 매장 주문

| 한글명         | 영문명          | 설명                      |
|-------------|--------------|-------------------------|
| 매장 주문       | eat in order | 고객이 요청한 매장 주문           |        
| 매장 주문 접수 대기 | waiting      | 매장이 주문을 접수하기 전 상태       |       
| 매장 주문 접수    | accepted     | 매장 주문을 접수한 상태.          |          
| 제공(서빙) 완료   | served       | 접수된 주문을 고객의 테이블로 제공한 상태 | 
| 주문 완료       | completed    | 메뉴를 전달받고 모든 주문이 종료된 상태  |  

## 모델링

### 상품

- `product`은 식별자와 이름, 가격을 가진다.
- `name`은 외부솔루션 `PurgomalumClient`을 통해 비속어 검사를 통과한 이름만 가질 수 있다.
- `price`은 0원 이상만 등록 가능하다.
- `product`은 `price` 0원 이상인 가격으로 변경한다.
- `price`을 변경할 때 해당 상품이 속한 메뉴들의 가격 비교 후 메뉴 가격보다 단일 상품들의 총금액이 더 비쌀 경우 해당 메뉴은 자동으로 숨김 상태로 변경된다.

```mermaid
stateDiagram-v2
    table: admin
    table --> product: 상품 등록
    product --> purgomalum: 비속어 검사
    purgomalum --> new_product
    table --> product: 상품 가격 변경
    product --> change_price_product
    product --> menu: 가격 비교
    menu --> hide_menu
```

### 메뉴그룹

- `menu_group`은 식별자와 이름을 가진다.
- `name`은 빈값이 아닌 이름만 가질 수 있다.

```mermaid
stateDiagram-v2
    table: admin
    table --> menu_group: 메뉴 그룹 등록
    menu_group --> new_menu_group
```

### 메뉴

- `menu`은 식별자와 이름, 가격, `menu_group`, 상태(노출/숨김), 메뉴상품들을 가진다.
- `name`은 외부솔루션 `PurgomalumClient`을 통해 비속어 검사를 통과한 이름만 가질 수 있다.
- `price`은 0원 이상만 등록 가능하다.
- `menu`은 `price` 0원 이상인 가격으로 변경한다.
- `menu`는 1개 이상의 `product`로 구성된다.
- `price`을 변경할 때 변경할 가격으로 메뉴 가격비교 후 더 비쌀 경우 자동으로 메뉴를 숨김 상태로 변경한다.

```mermaid
stateDiagram-v2
    table: admin
    table --> menu: 메뉴 등록
    menu --> purgomalum: 비속어 검사
    purgomalum --> new_menu
    table --> menu: 메뉴 가격 변경
    menu --> menu: 가격 비교
    menu --> hide_menu
    menu --> change_price_menu
```

### 주문테이블

- `order_table` 는 식별자와 이름, 손님 수, 빈 테이블 여부를 가진다.
- 빈 테이블 `empty table`은 주문을 받을 수 있는 상태를 의미한다. 이 상태의 `NumberOfGuests`는 0이다.
- 방문 손님 수 `number of guests`는 주문 테이블에 앉아있는 고객 수를 의미한다.
-  주문의 상태가 `completed` 이후 해당 `order_table` 은 다시 `empty table` 상태로 변경된다.

```mermaid
stateDiagram-v2
    table: empty_table
    table --> waiting: 매장 주문 등록
    waiting --> accepted: 매장 주문 접수
    accepted --> served: 매장 주문 서빙
    served --> completed: 매장 주문 완료
    completed --> table: 빈 테이블으로 변경
```

### 주문

- `order`는 주문을 의미한다. 식별자 ,`order type`,`order status`,`order line item`를 가진다
- `order`의 `order type`에 따라 추가적인 값을 가질 수 있다.
- `order status`는 주문의 진행 상태를 의미한다. `order type` 에 따라 다른 상태를 가진다.
- `order line item`은 주문된 `menu`와 수량을 의미한다.
- `order_line_item`을 가질 수 있으며 수량이 0 미만일 수 있다.
- `order_line_item`의 주문 가능한 `menu`는 `display` 상태인 메뉴이다.

### 매장 주문

- `order`의 `order type`이 `eat in order`이 매장에서 주문한 주문을 의미한다.
- `empty table` 이 있어야 주문을 등록할 수 있다.
- 주문 요청 시 `waiting` -> `accepted` -> `served` -> `completed` 순으로 주문이 진행된다.
    - `completed` 이후 사용 된 `order_table` 은 다시 `empty table` 상태로 변경된다.

```mermaid
sequenceDiagram
    participant Customer
    participant Order
    participant OrderTable
    Customer ->> Order: 매장 주문 요청 (상태: waiting)
    Order ->> OrderTable: 빈 테이블인지 확인
    OrderTable -->> Order: 빈 테이블 확인 완료
    Customer ->> Order: 매장 주문 접수 ( 상태: accepted )
    Order ->> OrderTable: 주문승인 테이블 할당 (상태: accepted)
    Order ->> Customer: 주문한 음식 서빙 ( 상태: served)
    Customer ->> Order: 식사 완료 후 주문 완료 (상태: completed)
    Order -->> OrderTable: empty table로 변경
```


### 배달 주문

- `order`의 `order type`이 `delivery order`이 배달 주문을 의미한다.
- `delivery order`는 `delivery address`를 가진다.
- 주문 요청 시 `waiting` -> `accepted` -> `served` -> `delivering` -> `delivered` -> `completed` 순으로 주문이 진행된다.
- 배달 주문이 `accepted`  시 `delivery agency`를 호출한다.

```mermaid
sequenceDiagram
    participant Customer
    participant SHOP
    participant Rider
    participant DeliveryAgency
    Customer ->> SHOP: 배달 주문 요청
    SHOP -->> Customer: 배달 주문 접수 완료
    SHOP ->> DeliveryAgency: 배달 요청 (상태: accepted)
    SHOP ->> Rider: 배달 음식 전달 (상태: served)
    Rider -->> Customer: 배달 진행 ( 상태: delivering)
    Rider ->> SHOP: 배달 완료 (상태: delivered)
    SHOP -->> Customer: 배달 주문 완료 (상태: completed)

```

### 포장 주문

- `order`의 `order type`이 `takeout order`이 포장 주문을 의미한다.
- 주문 요청 시 `waiting` -> `accepted` -> `served` -> `completed` 순으로 주문이 진행된다.

```mermaid
sequenceDiagram
    participant Customer
    participant SHOP
    Customer ->> SHOP: 포장 주문 요청
    SHOP -->> Customer: 포장 주문 접수 완료 (상태: accepted)
    SHOP ->> Customer: 포장 주문 제공 (상태: served)
    SHOP -->> Customer: 포장 주문 완료 (상태: completed)
```
