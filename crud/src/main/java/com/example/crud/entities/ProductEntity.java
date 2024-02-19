package com.example.crud.entities;

import com.example.crud.dto.PostProductDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int price;

    public ProductEntity(PostProductDTO data){
        this.name = data.name();
        this.price = data.price();
    }
}
