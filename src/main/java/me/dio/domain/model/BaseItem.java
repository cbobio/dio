package me.dio.domain.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@MappedSuperclass
public  abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "icon", nullable = false, length = 255)
    private String icon;

    @Column(name = "description", nullable = false, length = 400)
    private String description;
}
