package com.piotrek.pizzaaplicationtest.remote.rest.dto.response;

import com.piotrek.pizzaaplicationtest.domain.model.SizeType;

import java.math.BigDecimal;

public class SizeDto {
    private Integer id;
    private SizeType name;
    private BigDecimal price;

    public SizeDto() {
    }

    public SizeDto(Integer id, SizeType name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SizeType getName() {
        return name;
    }

    public void setName(SizeType name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
