package com.lims.service;

import java.util.Optional;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.lims.entity.Order;

public interface OrderService {

	Optional<Order> getOrderByOrderId(long orderId);

	void save(Order order);

	DataTablesOutput<Order> getOrderAll(DataTablesInput input);

	Order getOrderByUsernameAndBookIdAndStatusAndStatus(String username, Long bookId, int statusReturn,
			int statusReject);

}
