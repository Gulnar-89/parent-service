package com.company.order.controller;

import com.company.order.dto.OrderRequest;
import com.company.order.service.OrderSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrderSevice orderSevice;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
       orderSevice.placeOrder(orderRequest);
       return "Order Plased Successfully";
    }
}
