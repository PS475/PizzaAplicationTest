package com.piotrek.pizzaaplicationtest.remote.rest.dto.response;

import com.piotrek.pizzaaplicationtest.domain.model.OrderStatusType;
import com.piotrek.pizzaaplicationtest.remote.rest.dto.request.PersonDto;
import com.piotrek.pizzaaplicationtest.remote.rest.dto.request.PizzaCountDto;

import java.util.List;

public class OrderDto {
    private Integer id;
    private OrderStatusType status;
    private List<PizzaCountDto> pizzas;
    private PersonDto person;

    public OrderDto() {
    }

    public OrderDto(Integer id, OrderStatusType status, List<PizzaCountDto> pizzas, PersonDto person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<PizzaCountDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaCountDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
