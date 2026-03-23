
package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.coforge.dtos.OrderDto;
import com.coforge.dtos.OrderRequestDto;
import com.coforge.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    public List<OrderDto> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public OrderDto addOrder(@RequestBody OrderRequestDto dto) {
        return orderService.saveOrder(dto);
    }
}
