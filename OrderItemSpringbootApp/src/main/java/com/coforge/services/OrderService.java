
package com.coforge.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.daos.OrderDao;
import com.coforge.dtos.ItemDto;
import com.coforge.dtos.OrderDto;
import com.coforge.dtos.OrderRequestDto;
import com.coforge.entities.Item;
import com.coforge.entities.Order;

@Service
public class OrderService {

    @Autowired
    OrderDao orderDao;

    @Autowired
    ItemService itemService;

    public OrderDto saveOrder(OrderRequestDto requestDto) {

        Order order = new Order();
        order.setOrdDate(requestDto.getOrderDate());
        order.setTotalAmount(requestDto.getAmount());

        if (requestDto.getItemIds() != null) {
            for (long itemid : requestDto.getItemIds()) {
                Item item = itemService.getItemById(itemid);
                order.addItem(item);
            }
        }

        Order savedOrder = orderDao.saveOrder(order);
        return getOrderDtoFromOrder(savedOrder);
    }

    private OrderDto getOrderDtoFromOrder(Order order) {
        List<ItemDto> itemList = order.getItems()
                .stream()
                .map(item -> new ItemDto(item.getItemId(), item.getItemName(), item.getItemPrice()))
                .collect(Collectors.toList());

        return new OrderDto(order.getOrdId(), order.getOrdDate(), order.getTotalAmount(), itemList);
    }

    public List<OrderDto> getAllOrders() {
        return orderDao.getAllOrders()
                .stream()
                .map(this::getOrderDtoFromOrder)
                .collect(Collectors.toList());
    }
}
