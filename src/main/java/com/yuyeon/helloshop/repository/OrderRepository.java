package com.yuyeon.helloshop.repository;

import com.yuyeon.helloshop.domain.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderRepository extends JpaRepository<Long, Order>,
        JpaSpecificationExecutor<Order> {

}
