package br.org.luismario.models;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;
import java.io.Serializable;

@Entity
@Table(name = "games")
public class GameModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private BigDecimal price;
    private String description;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
