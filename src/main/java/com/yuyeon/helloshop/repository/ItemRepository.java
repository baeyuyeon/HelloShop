package com.yuyeon.helloshop.repository;

import com.yuyeon.helloshop.domain.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
