package com.company.order.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.lang.annotation.Documented;
import java.util.List;

@Entity
@Table(name = "order_service")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)
    List<OrderLineItems> orderLineItemsList;
}
