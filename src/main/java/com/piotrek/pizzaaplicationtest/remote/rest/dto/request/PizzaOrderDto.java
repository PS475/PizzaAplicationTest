package com.piotrek.pizzaaplicationtest.remote.rest.dto.request;

import java.util.List;

public class PizzaOrderDto {
    private List<PizzaCountDto> pizzas;
    private PersonDto person;

    public PizzaOrderDto() {
    }

    public PizzaOrderDto(List<PizzaCountDto> pizzas, PersonDto person) {
        this.pizzas = pizzas;
        this.person = person;
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
