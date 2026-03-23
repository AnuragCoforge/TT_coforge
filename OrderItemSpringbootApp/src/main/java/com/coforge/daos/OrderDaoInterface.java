package com.coforge.daos;

import java.util.List;
import java.util.Optional;

import com.coforge.entities.Order;

public interface OrderDaoInterface {
	public List<Order> getAllOrders();
	public Order saveOrder(Order order);
	public Optional<Order> getOrderById(long ordId);
	public Order updateOrder(Order order);
	public void deleteOrder(long ordId);
}
