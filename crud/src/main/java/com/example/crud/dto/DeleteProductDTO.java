package com.example.crud.dto;

import jakarta.validation.constraints.NotNull;

public record DeleteProductDTO(@NotNull Integer id) {}