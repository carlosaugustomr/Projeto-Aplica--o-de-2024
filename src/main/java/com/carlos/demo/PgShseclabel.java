package com.carlos.demo;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pg_shseclabel")
public class PgShseclabel {
    @EmbeddedId
    private PgShseclabelId id;

    @Column(name = "label", nullable = false, length = Integer.MAX_VALUE)
    private String label;

}