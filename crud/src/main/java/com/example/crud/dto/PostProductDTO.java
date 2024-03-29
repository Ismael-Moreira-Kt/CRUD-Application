package com.example.crud.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PostProductDTO(
        @NotBlank String name,
        @NotNull Integer price)
{}