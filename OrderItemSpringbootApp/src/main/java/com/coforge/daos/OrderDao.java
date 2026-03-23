
package com.coforge.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Order;
import com.coforge.repositories.OrderRepository;

@Repository
public class OrderDao {

    @Autowired
    private OrderRepository repository;

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Order saveOrder(Order order) {
        return repository.save(order);
    }

    public Optional<Order> getOrderById(long ordId) {
        return repository.findById(ordId);
    }

    public Order updateOrder(Order order) {
        return repository.save(order);
    }

    public void deleteOrder(long ordId) {
        repository.deleteById(ordId);
    }
}
