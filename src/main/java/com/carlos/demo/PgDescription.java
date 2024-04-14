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
@Table(name = "pg_description")
public class PgDescription {
    @EmbeddedId
    private PgDescriptionId id;

    @Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
    private String description;

}