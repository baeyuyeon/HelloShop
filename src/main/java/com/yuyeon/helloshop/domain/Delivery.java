package com.yuyeon.helloshop.domain;

import com.yuyeon.helloshop.domain.order.Order;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Delivery extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    /*private String city;
    private String street;
    private String zipcode;*/

    @Embedded
    private Address address;


    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

}
