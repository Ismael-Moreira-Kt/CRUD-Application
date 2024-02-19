package com.example.crud.dto;

import jakarta.validation.constraints.NotNull;

public record PutProductDTO(
        @NotNull  Integer id,
        String name,
        Integer price)
{}