package me.dio.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "tb_news")
public class News extends BaseItem {
}
