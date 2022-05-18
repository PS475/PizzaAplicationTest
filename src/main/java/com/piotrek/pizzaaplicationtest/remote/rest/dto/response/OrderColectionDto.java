package com.piotrek.pizzaaplicationtest.remote.rest.dto.response;

import java.util.List;

public class OrderColectionDto {
    private List<OrderDto> orders;

    public OrderColectionDto() {
    }

    public OrderColectionDto(List<OrderDto> orders) {
        this.orders = orders;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }
}
